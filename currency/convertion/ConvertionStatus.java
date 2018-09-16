package currency.convertion;

/**
 * Статус конвертации
 */
public class ConvertionStatus {

    /**
     * Все хорошо
     */
    public final static int OK = 0;
    /**
     * Ошибка
     */
    public final static int ERROR = 1;
    /**
     * Код статуса
     */
    int code;
    /**
     * Сообщение, поясняющее статус
     */
    String message;

    public ConvertionStatus(int code, String message) {
        this.code = code;
        this.message = message;
    }

    /**
     * Проверка успешного статуса
     * @return true, если статус успешный
     */
    public boolean isOK() {
        return code == OK;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}