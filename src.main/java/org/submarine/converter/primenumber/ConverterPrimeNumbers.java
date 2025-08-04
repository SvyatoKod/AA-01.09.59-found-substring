package org.submarine.converter.primenumber;

import org.submarine.converter.IConverterUniqNumber;

import java.util.HashMap;
import java.util.Map;

/**
 * Конвертер, превращающий строку/массив_символов в уникальное число, учитывающее перестановку символов.
 *
 * Идея реализации: перемножение простых чисел - есть уникальное число, которое не зависит от местоположения символов в строке.
 * 'abc' -> 2*3*5=30
 * 'cba' -> 5*3*2=30
 * 'bca' -> 3*5*2=30
 *  ...
 */
public class ConverterPrimeNumbers implements IConverterUniqNumber {

    Map<Character, Long> alphabetPrimesMap = new HashMap<>() {{
        // Строчные буквы
        put('a', 2L);
        put('b', 3L);
        put('c', 5L);
        put('d', 7L);
        put('e', 11L);
        put('f', 13L);
        put('g', 17L);
        put('h', 19L);
        put('i', 23L);
        put('j', 29L);
        put('k', 31L);
        put('l', 37L);
        put('m', 41L);
        put('n', 43L);
        put('o', 47L);
        put('p', 53L);
        put('q', 59L);
        put('r', 61L);
        put('s', 67L);
        put('t', 71L);
        put('u', 73L);
        put('v', 79L);
        put('w', 83L);
        put('x', 89L);
        put('y', 97L);
        put('z', 101L);

        // Заглавные буквы (значения совпадают со строчными)
        put('A', 2L);
        put('B', 3L);
        put('C', 5L);
        put('D', 7L);
        put('E', 11L);
        put('F', 13L);
        put('G', 17L);
        put('H', 19L);
        put('I', 23L);
        put('J', 29L);
        put('K', 31L);
        put('L', 37L);
        put('M', 41L);
        put('N', 43L);
        put('O', 47L);
        put('P', 53L);
        put('Q', 59L);
        put('R', 61L);
        put('S', 67L);
        put('T', 71L);
        put('U', 73L);
        put('V', 79L);
        put('W', 83L);
        put('X', 89L);
        put('Y', 97L);
        put('Z', 101L);
    }};

    @Override
    public Long convertStringToUniqNumber(String inputString) {
        char[] charArray = inputString.toCharArray();

        long multipllly = 1L;
        for (char c : charArray) {
            multipllly *= alphabetPrimesMap.get(c);
        }
        return multipllly;
    }

    @Override
    public Long convertStringToUniqNumber(char[] inputCharArray, int startIndex, int endIndex) {
        long multipllly = 1L;
        for (int i = startIndex; i < endIndex; i++) {
            multipllly *= alphabetPrimesMap.get(inputCharArray[i]);
        }
        return multipllly;
    }
}
