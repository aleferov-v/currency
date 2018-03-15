package currency.convertion;

import currency.person.Person;

public class ConvertData {

    private Person client;
    private Money from;
    private Currency to;

    public ConvertData(Person client, Money from, Currency to) {
        this.client = client;
        this.from = from;
        this.to = to;
    }

    public Person getClient() {
        return client;
    }

    public Money getFrom() {
        return from;
    }

    public Currency getTo() {
        return to;
    }
}
