package currency.services;

import currency.convertion.ConvertionRequest;
import currency.convertion.ConvertionResult;
import currency.convertion.ConvertionStatus;
import currency.convertion.Money;


public class ConvertionService {

    public static ConvertionResult convert(ConvertionRequest request) {
        double result = (request.getFrom().getAmount() * request.getFromRate()) / request.getToRate();
        Money resultMoney = new Money(request.getTo(), result);

        return new ConvertionResult(request.getFrom(), resultMoney, new ConvertionStatus(ConvertionStatus.OK, "Операция прошла успешно"));
    }
}
