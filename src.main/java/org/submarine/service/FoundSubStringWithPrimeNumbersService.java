package org.submarine.service;

import org.submarine.converter.IConverterUniqNumber;
import org.submarine.converter.primenumber.ConverterPrimeNumbers;

/**
 * Сервис для нахождения подстроки с учетом перестановки в строке.
 *
 * @author SvyatoKod
 */
public class FoundSubStringWithPrimeNumbersService implements IFoundSubString {

    /**
     * Конвертер для преобразование строки в уникальное число, независящее от пепрестановки.
     */
    private final IConverterUniqNumber converter = new ConverterPrimeNumbers();

    /**
     * Метод ищет подстроку с учетом перестановок в строке.
     *
     * Общая предпологаемая сложность алгоритма: O(|количество символов в исходной строке|)
     *
     * @param inputString исходная строка, в которой ищем вхождение;
     * @param inputSubString подстрока, которую ищем в исходной строке;
     * @return индекс вхождения подстроки в строке, иначе -1.
     */
    public int findSubString(String inputString, String inputSubString) {
        validateSubString(inputString, inputSubString);

        int lengthOfSubString = inputSubString.length();

        long uniqNumberBySubString = converter.convertStringToUniqNumber(inputSubString);
        char[] charArray = inputString.toCharArray();
        // Сложность цикла: O(|количество символов в исходной строке|)
        // Перебираем последддовательно все подстроки нашей исходной строки длиной равной искомой.
        for (int i = 0; i < charArray.length - lengthOfSubString ; i++) {
            // Перемножение примитивов очень хорошо оптимизированы, чуть ли не до константы ~O(1)
            long uniqNumber = converter.convertStringToUniqNumber(charArray, i, i + lengthOfSubString);
            // Сравниваем уникальные числа искомой строки с полученным числом
            if (uniqNumberBySubString == uniqNumber) {
                return i;
            }
        }

        return -1;
    }
}
