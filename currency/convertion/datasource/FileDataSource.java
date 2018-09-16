package currency.convertion.datasource;

import currency.person.Client;
import currency.convertion.ConvertData;
import currency.convertion.Currency;
import currency.convertion.Money;
import currency.person.DUL;
import currency.services.Utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Date;

/**
 * Файловый источник данных
 */
public class FileDataSource implements IDataSource {

    /**
     * Файл, содержащий информацию
     */
    private File file;

    public FileDataSource(File file) {
        this.file = file;
    }

    @Override
    public ConvertData getConvertData() {
        try (FileReader fileReader = new FileReader(file.getPath());
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            StringBuilder sb = new StringBuilder();
            int i = -1;
            while ((i = bufferedReader.read()) != -1) {
                sb.append((char) i);
            }
            String[] sections = sb.toString().split("Section:");

            String dulSection = sections[1];
            String[] dulSections = dulSection.split("\n");
            DUL dul = new DUL();
            dul.setType(dulSections[1]);
            dul.setSeria(dulSections[2]);
            dul.setNumber(dulSections[3]);
            dul.setDate(Utils.createDateFromString(dulSections[4]));
            dul.setCode(dulSections[5]);

            String fioSection = sections[2];
            String[] fioSections = fioSection.split("\n");
            String fio = fioSections[1];
            Date dob = Utils.createDateFromString(fioSections[2]);
            Client client = new Client(fio, dob, dul);

            String fromSection = sections[3];
            String[] fromSections = fromSection.split("\n");
            double fromAmount = Double.valueOf(fromSections[1]);
            Currency fromCurrency = Currency.valueOf(fromSections[2]);
            Money fromMoney = new Money(fromCurrency, fromAmount);

            String toSection = sections[4];
            String[] toSections = toSection.split("\n");
            Currency toCurrency = Currency.valueOf(toSections[1]);

            return new ConvertData(client, fromMoney, toCurrency);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
