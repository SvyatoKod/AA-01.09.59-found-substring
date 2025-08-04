package org.submarine.service;

import java.util.Arrays;

/**
 * Cервис для нахождения подстроки с учетом перестановки в строке.
 *
 * @author SvyatoKod
 */
public class FoundSubStringBySortService extends FoundSubStringService {

    /**
     * Сложность цикла: O(|количество символов в исходной строке|*log(|Длина подстроки|))
     */
    @Override
    public int findByAlgorithm(String inputString, String inputSubString) {
        char[] charArray = inputString.toCharArray();
        char[] subStringCharArray = inputSubString.toCharArray();
        // Перебираем последддовательно все ОТСОРТИРОВАННЫЕ подстроки нашей исходной строки длиной равной ОТСОРТИРОВАННОЙ искомой.
        Arrays.sort(subStringCharArray);
        for (int i = 0; i < charArray.length - subStringCharArray.length ; i++) {
            // Сравниваем все ОТСОРТИРОВАННЫЕ строки с ОТСОРТИРОВАННОЙ подстрокой
            boolean found = true;
            char[] foundSubString = Arrays.copyOfRange(charArray, i, i + subStringCharArray.length);
            Arrays.sort(foundSubString);
            for (int j = 0; j < subStringCharArray.length ; j++) {
                if (subStringCharArray[j] != foundSubString[j]) {
                    found = false;
                    break;
                }
            }
            if (found) return i;
        }

        return -1;
    }
}
