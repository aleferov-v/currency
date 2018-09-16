package currency.convertion.datasource;

import currency.convertion.ConvertData;

/**
 * Общий интерфейс для всех источников данных
 */
public interface IDataSource {

    ConvertData getConvertData();
}
