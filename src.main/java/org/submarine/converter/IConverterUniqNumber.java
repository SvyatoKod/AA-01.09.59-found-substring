package org.submarine.converter;

/**
 * Конвертер, превращающий строку/массив_символов в уникальное число.
 *
 * Уникальное число не зависит от перестановки в строке, т.е. оно не меняет значениие, если переставить символы в строке.
 *
 * @author SvyatoKod
 */
 public interface IConverterUniqNumber {

     Long convertStringToUniqNumber(String inputString);

     Long convertStringToUniqNumber(char[] inputCharArray, int startIndex, int endIndex);
}
