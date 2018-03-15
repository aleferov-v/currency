package currency.services;

import currency.convertion.ConvertionRequest;
import currency.convertion.ConvertionResult;
import currency.convertion.Money;

/**
 * Класс, отвечающий за вывод информации на печать
 */
public class Printer {

    public void printResult(ConvertionResult convertionResult) {
        if (convertionResult.getStatus().isOK()) {
            printOK(convertionResult);
        } else {
            printERROR(convertionResult);
        }
    }

    private void printOK(ConvertionResult result) {
        printOK(result, "Обмен валюты произведен успешно.");
    }

    private void printOK(ConvertionResult result, String message) {
        Money from = result.getFromMoney();
        Money to = result.getToMoney();

        System.out.println(message);
        System.out.printf("Получено от клиента: %.2f %s%n", from.getAmount(), from.getCurrency());
        System.out.printf("Отдано клиенту: %.2f %s%n", to.getAmount(), to.getCurrency());
    }

    private void printERROR(ConvertionResult result) {
        printERROR(result, "Обмен валюты произвести не удалось.");
    }

    private void printERROR(ConvertionResult result, String message) {
        Money from = result.getFromMoney();
        Money to = result.getToMoney();

        System.out.println(message);
        System.out.printf("Причина: %s%n", result.getStatus().getMessage());
    }
}
