package currency.convertion;

import currency.person.Client;

/**
 * Данные для конвертирования валюты
 */
public class ConvertData {

    /**
     * Клиент, для которого необходимо сконвертировать деньги
     */
    private Client client;
    /**
     * Из какой валюты и какую сумму необходимо сконвертировать
     */
    private Money from;
    /**
     * Валюта, в которую необходимо сконвертировать
     */
    private Currency to;

    public ConvertData(Client client, Money from, Currency to) {
        this.client = client;
        this.from = from;
        this.to = to;
    }

    public Client getClient() {
        return client;
    }

    public Money getFrom() {
        return from;
    }

    public Currency getTo() {
        return to;
    }
}
