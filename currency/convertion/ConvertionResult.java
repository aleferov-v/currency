package currency.convertion;

/**
 * Результат конвертации. Содержит деньги в целевой валюте (если конвертация удалась) и статус конвертации
 */
public class ConvertionResult {

    /**
     * Деньги, из которых производилась конвертация
     */
    private final Money fromMoney;
    /**
     * Деньги, в которые производилась конвертация
     */
    private final Money toMoney;
    /**
     * Статус конвертации
     */
    private ConvertionStatus status;

    public ConvertionResult(Money fromMoney, Money toMoney, ConvertionStatus status) {
        this.fromMoney = fromMoney;
        this.toMoney = toMoney;
        this.status = status;
    }

    public Money getFromMoney() {
        return fromMoney;
    }

    public Money getToMoney() {
        return toMoney;
    }

    public ConvertionStatus getStatus() {
        return status;
    }
}
