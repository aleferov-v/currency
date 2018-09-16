package currency.convertion.convertors;

import currency.convertion.ConvertData;
import currency.convertion.ConvertionResult;
import currency.person.Operator;

/**
 * Интерфейс конвертера валют
 */
public interface ICurrencyConverter {

    /**
     * Функция конвертации, которая на вход получает данные для конвертации, а на выход отдает результат конвертации
     *
     * @param data - данные для конвертации
     * @param operator - оператор, производящий конвертацию
     * @return - результат конвертации
     */
    ConvertionResult convert(ConvertData data, Operator operator);

}
