package currency.convertion;

/**
 * Статус заявки на конвертацию
 */
public enum ConvertionRequestStatus {
    CREATED("Заявка создана"),
    IN_WORK("Заявка в работе"),
    CLOSED("Заявка закрыта");

    private String description;

    ConvertionRequestStatus(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
