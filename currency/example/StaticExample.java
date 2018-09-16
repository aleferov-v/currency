package currency.example;

import currency.person.Client;
import currency.convertion.ConvertData;
import currency.convertion.ConvertionRequest;
import currency.convertion.Currency;
import currency.convertion.Money;
import currency.person.DUL;
import currency.person.Operator;
import currency.services.Utils;

public class StaticExample {

    public static void main(String[] args) throws InterruptedException {
        Operator operator = new Operator("Ivanov", "1234/5678");

        ConvertData convertData1 = createConvertData1();
        operator.createRequest(convertData1);

        ConvertData convertData2 = createConvertData2();
        operator.createRequest(convertData2);

        System.out.println("Количество созданных заявок: " + ConvertionRequest.getCounter());
    }

    private static ConvertData createConvertData1() {
        Client client = new Client("Петров А.А.", Utils.createDateFromString("1988-11-27"), new DUL());
        Money from = new Money(Currency.RUB, 10_000);

        return new ConvertData(client, from, Currency.EUR);
    }

    private static ConvertData createConvertData2() {
        Client client = new Client("Сидоров А.А.", Utils.createDateFromString("1988-11-27"), new DUL());
        Money from = new Money(Currency.RUB, 10_000);

        return new ConvertData(client, from, Currency.USD);
    }
}
