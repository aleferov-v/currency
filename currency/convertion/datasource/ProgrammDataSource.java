package currency.convertion.datasource;

import currency.person.Client;
import currency.convertion.ConvertData;
import currency.convertion.Currency;
import currency.convertion.Money;
import currency.person.DUL;
import currency.services.Utils;

/**
 * Класс программного источника данных. Все данные заполняются в ходе выполнения программы (в рантайме)
 */
public class ProgrammDataSource implements IDataSource {

    @Override
    public ConvertData getConvertData() {
        DUL dul = createDUL();
        Client client = createClient(dul);
        Money from = createMoney();

        return new ConvertData(client, from, Currency.USD);
    }

    private Money createMoney() {
        return new Money(Currency.RUB, 10_000);
    }

    private Client createClient(DUL dul) {
        return new Client("Иванов А.А.", Utils.createDateFromString("1988-11-27"), dul);
    }

    private DUL createDUL() {
        DUL dul = new DUL();
        dul.setType("Паспорт");
        dul.setSeria("97 07");
        dul.setNumber("263887");
        dul.setDate(Utils.createDateFromString("2005-04-30"));
        dul.setCode("010-201");
        return dul;
    }
}
