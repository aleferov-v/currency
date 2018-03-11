package currency.person;

import java.util.Date;

/**
 * Данные клиента
 */
public class Person {

    private String fio;
    private Date birthday;
    private DUL document;

    public Person(String fio, Date birthday, DUL document) {
        this.fio = fio;
        this.birthday = birthday;
        this.document = document;
    }

    public String getFio() {
        return fio;
    }

    public Date getBirthday() {
        return birthday;
    }

    public DUL getDocument() {
        return document;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fio='" + fio + '\'' +
                ", birthday=" + birthday +
                ", document=" + document +
                '}';
    }
}
