package currency.services;

import currency.person.Operator;

/**
 * Служба управления - сервис, обеспечивающий работу с персоналом
 */
public class ManagmentService {

    /**
     * Метод возвращает оператора, чья смена сегодня (в текущий день недели)
     *
     * @return оператора текущей смены
     */
    public Operator getTodayOperator() {
        //TODO: сделать выбор по текущему дню
        //
        Operator operator = new Operator("OperatorPopovIA", "7954/1721");
        return operator;
    }
}
