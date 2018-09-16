package currency;

import currency.convertion.ConvertData;
import currency.convertion.ConvertionResult;
import currency.convertion.convertors.CurrencyConverter;
import currency.convertion.datasource.FileDataSource;
import currency.convertion.datasource.IDataSource;
import currency.convertion.datasource.ProgrammDataSource;
import currency.person.Operator;
import currency.services.ManagmentService;
import currency.services.Printer;

import java.io.File;

/**
 * Главный класс, начальная точка входа в программу
 */
public class CurrencyMain {

    public static final String CLIENTS_FILE = "resources/clients.txt";

    public static void main(String[] args) {
        CurrencyConverter converter = new CurrencyConverter();
        Printer printer = new Printer();
        ManagmentService managmentService = new ManagmentService();
        Operator operator = managmentService.getTodayOperator();

        System.out.println(" =============== Работа конвертера с данными, полученными программно =============== ");

        IDataSource dataSource = new ProgrammDataSource();
        ConvertData dataSourceConvertData = dataSource.getConvertData();

        ConvertionResult convertionResult = converter.convert(dataSourceConvertData, operator);
        if (convertionResult != null) {
            System.out.println("Печать результата:");
            printer.print(convertionResult);
        }
        System.out.println();

        System.out.println(" =============== Работа конвертера с данными, полученными из файла =============== ");
        File clientsFile = new File(CLIENTS_FILE);

        IDataSource fileDataSource = new FileDataSource(clientsFile);
        ConvertData fileDataSourceConvertData = fileDataSource.getConvertData();

        ConvertionResult fileConvertionResult = converter.convert(fileDataSourceConvertData, operator);
        if (fileConvertionResult != null) {
            System.out.println("Печать результата:");
            printer.print(fileConvertionResult);
        } else {
            System.out.println("Не удалось получить данные из файла");
        }

    }

}
