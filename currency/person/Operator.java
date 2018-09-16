package currency.person;

import currency.convertion.ConvertData;
import currency.convertion.ConvertionRequest;
import currency.convertion.Currency;
import currency.convertion.Money;
import currency.services.CentralBankService;
import currency.services.Utils;

/**
 * Оператор, выполняющий операции, связанные с конвертацией
 */
public class Operator extends Person {

    /**
     * Номер внутреннего структурного подразделения
     */
    private String vsp;

    public Operator(String login, String vsp) {
        super(login);
        this.vsp = vsp;
    }

    @Override
    public void displayInfo() {
        System.out.printf("%s (ВСП №%s)\n", name, vsp);
    }


    /**
     * Создать заявку на конвертацию
     *
     * @data - данные для создания заявки
     * @return заявка
     */
    public ConvertionRequest createRequest(ConvertData data) {
        System.out.println("Процесс создания заявки на конвертацию...");
        Utils.sleep();
        CentralBankService bankService = CentralBankService.getInstance();
        Money from = data.getFrom();
        Currency to = data.getTo();
        double fromRate = bankService.getCurrentRate(data.getFrom().getCurrency());
        double toRate = bankService.getCurrentRate(data.getTo());

        ConvertionRequest convertionRequest = new ConvertionRequest(from, to, fromRate, toRate);
        System.out.println("Создана заявка на конвертацию №: " + convertionRequest.getId());
        System.out.println("Статус заяки: \"" + convertionRequest.getStatus().getDescription() + "\"");
        Utils.sleep();
        return convertionRequest;
    }

    /**
     * Проверить клиента
     *
     * @param client - клиент
     * @return - результат проверки
     */
    public boolean check(Client client) {
        System.out.println("Старт операции проверки клиента...");
        System.out.print("Информация о клиенте: ");
        Utils.sleep();
        client.displayInfo();

        boolean result = client.getDocument() != null;

        System.out.print("Проверка пройдена: " );
        Utils.sleep();
        System.out.println((result ? "Успешно" : "Неуспешно"));

        System.out.println("Завершение операции проверки клиента...");

        return result;
    }

}
