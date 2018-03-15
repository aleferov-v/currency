package currency;
import currency.convertion.*;
import currency.person.DUL;
import currency.person.Person;
import currency.services.Printer;
import currency.services.Utils;

import java.io.File;

public class CurrencyMain {

    public static void main(String[] args) throws InterruptedException {
        IDataSource dataSource = new ProgrammDataSource();
        IDataSource fileDataSource = new FileDataSource(new File("resources/clients.txt"));

        CurrencyConverter converter = new CurrencyConverter();
        Printer printer = new Printer();

        ConvertionResult convertionResult = converter.convert(dataSource.getConvertData());
        if (convertionResult != null) {
            System.out.println("Результат конвертера с данными, заполняемыми программно:");
            printer.printResult(convertionResult);
        }
        System.out.println();

        ConvertionResult fileConvertionResult = converter.convert(fileDataSource.getConvertData());
        if (fileConvertionResult != null) {
            System.out.println("Результат конвертера, считывающего данные из файла:");
            printer.printResult(fileConvertionResult);
        }

    }

}
