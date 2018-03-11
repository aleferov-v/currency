package currency;
import currency.convertion.ConvertionRequest;
import currency.convertion.ConvertionResult;
import currency.convertion.Currency;
import currency.convertion.Money;
import currency.operator.Operator;
import currency.person.DUL;
import currency.person.Person;
import currency.services.CentralBankService;
import currency.services.ConvertionService;
import currency.services.Printer;
import currency.services.Utils;

public class CurrencyMain {

    public static void main(String[] args) {
        DUL dul = new DUL();
        dul.setType("Паспорт");
        dul.setSeria("97 07");
        dul.setNumber("263887");
        dul.setDate(Utils.createDate("2005-04-30"));
        dul.setCode("010-201");

        Person person = new Person("Иванов А.А.", Utils.createDate("1988-11-27"), dul);
        Operator operator = new Operator("operatorPetrovBD", "ВСП 7977/1587");

        Money from = new Money(Currency.RUB, 10_000);
        Currency to = Currency.USD;

        ConvertionRequest request = operator.createRequest(person, from, to,
                CentralBankService.getCurrentRate(from.getCurrency()),
                CentralBankService.getCurrentRate(to));

        if (request != null) {
            ConvertionResult convertionResult = ConvertionService.convert(request);
            if (convertionResult.getStatus().isOK()) {
                Printer.printOK(request, convertionResult);
            } else {
                Printer.printERROR(convertionResult);
            }
        }
    }

}
