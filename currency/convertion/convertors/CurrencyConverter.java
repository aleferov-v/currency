package currency.convertion.convertors;

import currency.person.Client;
import currency.convertion.*;
import currency.person.Operator;
import currency.services.Utils;

/**
 * Класс, реализующий интерфейс конвертации валют
 */
public class CurrencyConverter implements ICurrencyConverter {

    @Override
    public ConvertionResult convert(ConvertData data, Operator operator) {
        System.out.println("Старт операции конвертации...");
        System.out.print("Работает оператор: ");
        Utils.sleep();
        operator.displayInfo();

        ConvertionResult convertionResult;
        Client client = data.getClient();
        if (operator.check(client)) {
            ConvertionRequest request = operator.createRequest(data);

            Money resultMoney = doConvert(request);
            Money from = request.getFrom();
            ConvertionStatus convertionStatus = new ConvertionStatus(ConvertionStatus.OK, "Операция прошла успешно");
            convertionResult = new ConvertionResult(from, resultMoney, convertionStatus);
            request.setStatus(ConvertionRequestStatus.CLOSED);
        } else {
            ConvertionStatus convertionStatus = new ConvertionStatus(ConvertionStatus.ERROR, "Операция прошла неудачно");
            convertionResult = new ConvertionResult(null, null, convertionStatus);
        }

        System.out.println("Операция конвертации завершена...");
        Utils.sleep();
        return convertionResult;
    }

    // Метод производит вычисления конвертации по формуле: сумма_после_конвертации = (текущая_сумма * текущий_курс) / целевой_курс_конвертации
    //
    public Money doConvert(ConvertionRequest request) {
        request.setStatus(ConvertionRequestStatus.IN_WORK);

        double result = (request.getFrom().getAmount() * request.getFromRate()) / request.getToRate();
        return new Money(request.getTo(), result);
    }

}
