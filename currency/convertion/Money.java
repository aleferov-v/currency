package currency.convertion;

/**
 * Класс, описывающий деньги. Содержит в себе сумму денег и валюту
 */
public class Money {
    /**
     * Валюта
     */
    private Currency currency;
    /**
     * Сумма денег
     */
    private double amount;

    public Money(Currency currency, double amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public Currency getCurrency() {
        return currency;
    }

    public double getAmount() {
        return amount;
    }
}
