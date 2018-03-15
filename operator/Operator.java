package currency.operator;

import currency.convertion.ConvertionRequest;
import currency.convertion.Currency;
import currency.convertion.Money;
import currency.person.Person;

/**
 * Оператор, соврешающий конвертацию. Его задача - проверить данные и если все ок, создать заявку на конвертацию валюты
 */
public class Operator {

    /**
     * Логин оператора
     */
    private String login;
    /**
     * Наименование ВСП
     */
    private String vsp;

    public Operator(String login, String vsp) {
        this.login = login;
        this.vsp = vsp;
    }

    /**
     * Создать заявку на конвертацию. Прежде, необходимо проверить возможность создания заявки
     *
     * @param person - клиент
     * @param from - исходные деньги
     * @param to - целевая валюта
     * @param fromRate - исходные курс
     * @param toRate - целевой курс
     * @return - заявка, если есть возможность ее создания
     */
    public ConvertionRequest createRequest(Person person, Money from, Currency to, double fromRate, double toRate) {
        if (person.getDocument() != null) {
            return new ConvertionRequest(from, to, fromRate, toRate);
        }
        return null;
    }

    public boolean check(Person client) {
        return client.getDocument() != null;
    }
}
