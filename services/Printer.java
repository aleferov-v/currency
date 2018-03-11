package currency.services;

import currency.convertion.ConvertionRequest;
import currency.convertion.ConvertionResult;
import currency.convertion.Money;

/**
 * Класс, отвечающий за вывод информации на печать
 */
public class Printer {

    public static void printOK(ConvertionRequest request, ConvertionResult result) {
        printOK(request, result, "Обмен валюты произведен успешно.");
    }

    public static void printOK(ConvertionRequest request, ConvertionResult result, String message) {
        Money from = request.getFrom();
        Money to = result.getMoney();
        System.out.println(message);
        System.out.printf("Получено от клиента: %2f %s%n", from.getAmount(), from.getCurrency());
        System.out.printf("Отдано клиенту: %2f %s%n", to.getAmount(), to.getCurrency());
    }

    public static void printERROR(ConvertionResult result) {
        printERROR(result, "Обмен валюты произвести не удалось.");
    }

    public static void printERROR(ConvertionResult result, String message) {
        Money to = result.getMoney();
        System.out.println(message);
        System.out.printf("Причина: %s%n", result.getStatus().getMessage());
    }

}
