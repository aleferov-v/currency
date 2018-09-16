package currency.services;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.UUID;

/**
 * Вспомогательный класс, содержащий в себе так называемые утильные методы
 */
public class Utils {

    public static UUID generateId() {
        return UUID.randomUUID();
    }

    public static Date asDate(LocalDate localDate) {
        return Date.from(localDate.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
    }

    public static Date createDateFromString(String date) {
        return Utils.asDate(LocalDate.parse(date));
    }

    public static String createStringFromDate(Date date) {
        DateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy");
        return dateFormat.format(date);
    }


    /**
     * Приостанавливает выполнение программы, имитирую реальную задержку. Только для наглядности
     * @param ms
     */
    public static void sleep(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void sleep() {
//        sleep(1000);
    }
}