package currency.convertion;

/**
 * Валюта
 */
public enum Currency {

    RUB("Российский рубль"), USD("Доллар США"), EUR("Евро");

    private String description;

    Currency(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
