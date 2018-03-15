package currency.person;

import java.util.Date;

/**
 * Данные клиента
 */
public class Person {

    /**
     * ФИО клиента
     */
    private String fio;
    /**
     * Дата рождения клиента
     */
    private Date birthday;
    /**
     * Удостоверяющий личность документ
     */
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
