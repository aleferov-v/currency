package currency.person;

import currency.person.DUL;
import currency.person.Person;
import currency.services.Utils;

import java.util.Date;

/**
 * Клиент, который пришел на обслуживание в банк
 */
public class Client extends Person {

    /**
     * Дата рождения клиента
     */
    private Date birthday;
    /**
     * Документ, удостоверяющий личность
     */
    private DUL document;

    public Client(String fio, Date birthday, DUL document) {
        super(fio);
        this.birthday = birthday;
        this.document = document;
    }
    public DUL getDocument() {
        return document;
    }

    @Override
    public void displayInfo() {
        System.out.printf("ФИО: %s, дата рождения: %s, документ: %s\n", name, Utils.createStringFromDate(birthday), document.toString());
    }
}
