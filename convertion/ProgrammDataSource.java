package currency.convertion;

import currency.person.DUL;
import currency.person.Person;
import currency.services.Utils;

public class ProgrammDataSource implements IDataSource {

    @Override
    public ConvertData getConvertData() {
        DUL dul = new DUL();
        dul.setType("Паспорт");
        dul.setSeria("97 07");
        dul.setNumber("263887");
        dul.setDate(Utils.createDate("2005-04-30"));
        dul.setCode("010-201");

        Person client = new Person("Иванов А.А.", Utils.createDate("1988-11-27"), dul);
        Money from = new Money(Currency.RUB, 10_000);

        return new ConvertData(client, from, Currency.USD);
    }
}
