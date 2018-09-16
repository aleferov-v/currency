package currency.convertion;

import currency.services.Utils;

import java.util.UUID;

/**
 * Заявка на конвертацию валюты
 */
public class ConvertionRequest {

    /**
     * Счетчик заявок. Используется для демонстрации поведения статических полей в классе {@link currency.example.StaticExample}
     */
    private static int counter;

    /**
     * Уникальный идентификатор заявки
     */
    private UUID id;
    /**
     * Из какой валюты и какая сумма конвертируется
     */
    private Money from;
    /**
     * В какую валюту происходит конвертация
     */
    private Currency to;
    /**
     * Текущий курс исходной валюты
     */
    private double fromRate;
    /**
     * Текущий курс целевой валюты
     */
    private double toRate;
    /**
     * Статус заявки на конвертацию
     */
    private ConvertionRequestStatus status;

    public ConvertionRequest(Money from, Currency to, double fromRate, double toRate) {
        this.id = Utils.generateId();
        this.from = from;
        this.to = to;
        this.fromRate = fromRate;
        this.toRate = toRate;
        this.status = ConvertionRequestStatus.CREATED;
        this.counter++;
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

    public static int getCounter() {
        return counter;
    }

    public ConvertionRequestStatus getStatus() {
        return status;
    }

    public void setStatus(ConvertionRequestStatus status) {
        this.status = status;
    }

    public UUID getId() {
        return id;
    }

    @Override
    public String toString() {
        return "ConvertionRequest{" +
                "id=" + id +
                ", from=" + from +
                ", to=" + to +
                ", fromRate=" + fromRate +
                ", toRate=" + toRate +
                ", status=" + status +
                '}';
    }
}
