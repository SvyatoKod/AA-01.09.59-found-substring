package org.submarine.service;

/**
 * Интерфейс для нахождения подстроки с учетом перестановки в строке.
 *
 * @author SvyatoKod
 */
public interface IFoundSubString {

    /**
     * Метод ищет подстроку с учетом перестановок в строке.
     *
     * @param inputString исходная строка, в которой ищем вхождение;
     * @param inputSubString подстрока, которую ищем в исходной строке;
     * @return индекс вхождения подстроки в строке, иначе -1.
     */
    int findSubString(String inputString, String inputSubString);

    /**
     * Валидация входящих значений.
     */
    default void validateSubString(String inputString, String inputSubString) {
        if (inputSubString.length() > inputString.length()) {
            throw new IllegalArgumentException("Неверное значение входящий подстроки: длина подстроки больше самой строки :(");
        }
    }

}
