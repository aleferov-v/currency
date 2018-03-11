package currency.services;

import currency.convertion.Currency;

/**
 * Сервис, имитирующий работу с текущими ставками центробанка относительно валют
 */
public class CentralBankService {

    /**
     * Получить текущую ставку для валюты
     *
     * @param currency - валюта
     * @return текущая ставка
     */
    public static double getCurrentRate(Currency currency) {
        double result = 1;
        switch (currency) {
            case USD:
                result = 56.80;
                break;
            case EUR:
                result = 70.53;
                break;
        }
        return result;
    }

    ;

}
