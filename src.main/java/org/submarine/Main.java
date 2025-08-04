package org.submarine;

import org.submarine.service.FoundSubStringWithPrimeNumbersService;

public class Main {
    /**
     * Сервис для нахождения подстроки в строке.
     * Метод findSubString возвращает подстроку в искомой строке с учетом переставновок, иначе пустая строка.
     */
    private static FoundSubStringWithPrimeNumbersService foundSubStringService = new FoundSubStringWithPrimeNumbersService();

    public static void main(String[] args) {

        String T = "ifoundyourweaknesswordinyoursentence";
        String subStringT = "rodw"; // word

        System.out.println("Исходная строка: " + T);
        System.out.println("Искомая подстрока: " + subStringT);
        int foundIndex = foundSubStringService.findSubString(T, subStringT);
        System.out.println("Индекс искомой подстроки в исходной строке: " + foundIndex);
        String foundString = foundIndex != -1 ? T.substring(foundIndex, foundIndex + subStringT.length()) : "";
        System.out.println("Искомая подстрока в исходной строке: " + foundString);
    }
}
