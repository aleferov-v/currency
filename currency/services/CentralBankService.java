package currency.services;

import currency.convertion.Currency;

/**
 * Сервис, имитирующий работу с текущими ставками центробанка относительно валют
 */
public class CentralBankService {

    /**
     * Текущий курс доллара
     */
    public static final double USD_RATE = 56.80;
    /**
     * Текущий курс евро
     */
    public static final double EUR_RATE = 70.53;
    /**
     * Единственный экземпляр сервиса работы с центральным банком
     */
    public static CentralBankService instance;

    /**
     * Метод получения инстанса (экземпляра) сервиса
     *
     * @return сервис работы с центральным банком
     */
    public static CentralBankService getInstance() {
        if (instance == null) {
            instance = new CentralBankService();
        }
        return instance;
    }

    /**
     * Получить текущую ставку для валюты. Если ни то ни другое не выбрано, то текущая ставка будет 1, т.е. курс 1 к 1
     *
     * @param currency - валюта
     * @return текущая ставка
     */
    public double getCurrentRate(Currency currency) {
        Utils.sleep();

        double result = 1;
        switch (currency) {
            case USD:
                result = USD_RATE;
                break;
            case EUR:
                result = EUR_RATE;
                break;
        }
        return result;
    }


}
