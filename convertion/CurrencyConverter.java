package currency.convertion;

import currency.operator.Operator;
import currency.person.Person;
import currency.services.CentralBankService;
import currency.services.ConvertionService;

public class CurrencyConverter extends AbstractCurrencyConverter {

    @Override
    public ConvertionResult convert(ConvertData data) {
        Operator operator = getActiveOperator();
        Person client = data.getClient();

        if (operator.check(client)) {
            CentralBankService bankService = CentralBankService.getInstance();
            ConvertionRequest request = operator.createRequest(client, data.getFrom(), data.getTo(),
                    bankService.getCurrentRate(data.getFrom().getCurrency()), bankService.getCurrentRate(data.getTo()));
            return ConvertionService.convert(request);
        }
        return null;
    }
}
