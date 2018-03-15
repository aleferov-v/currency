package currency.convertion;

import currency.operator.Operator;
import currency.services.CentralBankService;

public abstract class AbstractCurrencyConverter implements ICurrencyConverter {

    public Operator getActiveOperator() {
        return new Operator("OperatorPopovIA", "7954/1721");
    };


}
