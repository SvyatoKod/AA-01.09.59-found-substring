package org.submarine.service;

/**
 * Абстрактный сервис для нахождения подстроки с учетом перестановки в строке.
 *
 * @author SvyatoKod
 */
public abstract class FoundSubStringService implements IFoundSubString {

    /**
     * Сложность цикла: O(|количество символов в исходной строке|*log(|Длина подстроки|))
     */
    @Override
    public int findSubString(String inputString, String inputSubString) {
        validateSubString(inputString, inputSubString);

        return findByAlgorithm(inputString, inputSubString);
    }

    /**
     * Алгоритм поиска подстроки с учетом перестановок символов в строке.
     *
     * @param inputString исходная строка, в которой ищем вхождение;
     * @param inputSubString подстрока, которую ищем в исходной строке;
     * @return индекс вхождения подстроки в строке, иначе -1.
     */
    protected abstract int findByAlgorithm(String inputString, String inputSubString);

    /**
     * Валидация входящих значений.
     */
    private void validateSubString(String inputString, String inputSubString) {
        if (inputSubString.length() > inputString.length()) {
            throw new IllegalArgumentException("Неверное значение входящий подстроки: длина подстроки больше самой строки :(");
        }
    }
}
