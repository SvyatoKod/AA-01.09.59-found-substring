package org.submarine.service.uniqnumber;

import org.submarine.converter.uniqnumber.IConverterUniqNumber;
import org.submarine.service.FoundSubStringService;

/**
 * Абстрактный сервис для нахождения подстроки с учетом перестановки в строке.
 *
 * @author SvyatoKod
 */
public abstract class FoundSubStringByUniqNumberService extends FoundSubStringService {

    /**
     * Конвертер для преобразование строки в уникальное число, независящее от пепрестановки символов в строке.
     */
    private final IConverterUniqNumber converter;

    public FoundSubStringByUniqNumberService(IConverterUniqNumber converter) {
        this.converter = converter;
    }

    /**
     * Сложность: O(|количество символов в исходной строке|) * ~O(1)
     */
    @Override
    public int findByAlgorithm(String inputString, String inputSubString) {
        int lengthOfSubString = inputSubString.length();

        long uniqNumberBySubString = converter.convertCharArrayToUniqNumber(inputSubString);
        char[] charArray = inputString.toCharArray();
        // Перебираем последддовательно все подстроки нашей исходной строки длиной равной искомой.
        for (int i = 0; i < charArray.length - lengthOfSubString ; i++) {
            // Тут всё зависит от сложность нахождения уникального числа (например, для перемножения примитивов сложность будет ~O(1))
            long uniqNumber = converter.convertCharArrayToUniqNumber(charArray, i, i + lengthOfSubString);
            // Сравниваем уникальные числа искомой строки с полученным числом
            if (uniqNumberBySubString == uniqNumber) {
                return i;
            }
        }

        return -1;
    }
}
