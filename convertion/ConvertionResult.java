package currency.convertion;

/**
 * Результат конвертации. Содержит деньги в целевой валюте (если конвертация удалась) и статус конвертации
 */
public class ConvertionResult {

    /**
     * Деньги в целевой валюте
     */
    private Money money;
    /**
     * Статус конвертации
     */
    private ConvertionStatus status;

    public ConvertionResult(Money money, ConvertionStatus status) {
        this.money = money;
        this.status = status;
    }

    public Money getMoney() {
        return money;
    }

    public ConvertionStatus getStatus() {
        return status;
    }
}
