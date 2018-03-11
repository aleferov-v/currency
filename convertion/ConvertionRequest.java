package currency.convertion;

import currency.services.Utils;

import java.util.UUID;

/**
 * Заявка на конвертацию валюты
 */
public class ConvertionRequest {

    /**
     * Уникальный номер заявки
     */
    private UUID id;
    /**
     * Деньги, которые необходимо будет перевести в другую валюту
     */
    private Money from;
    /**
     * Целевая валюта
     */
    private Currency to;
    /**
     * Ставка исходной валюты
     */
    private double fromRate;
    /**
     * Ставка целевой валюты
     */
    private double toRate;
    /**
     * Статус заявки
     */
    private ConvertionRequestStatus status;

    public ConvertionRequest(Money from, Currency to, double fromRate) {
        this(from, to, fromRate, 1);
    }

    public ConvertionRequest(Money from, Currency to, double fromRate, double toRate) {
        this.id = Utils.generateId();
        this.from = from;
        this.to = to;
        this.fromRate = fromRate;
        this.toRate = toRate;
        this.status = ConvertionRequestStatus.CREATED;
    }

    public Money getFrom() {
        return from;
    }

    public Currency getTo() {
        return to;
    }

    public double getFromRate() {
        return fromRate;
    }

    public double getToRate() {
        return toRate;
    }
}
