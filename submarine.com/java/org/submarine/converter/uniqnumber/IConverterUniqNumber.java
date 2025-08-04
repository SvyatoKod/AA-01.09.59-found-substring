package org.submarine.converter.uniqnumber;

/**
 * Конвертер, превращающий строку/массив_символов в уникальное число.
 *
 * Уникальное число строки не зависит от перестановки символов в ней, т.е. оно число не меняется, если переставить символы в строке.
 *
 * @author SvyatoKod
 */
 public interface IConverterUniqNumber {

     Long convertCharArrayToUniqNumber(String inputString);

     Long convertCharArrayToUniqNumber(char[] inputCharArray, int startIndex, int endIndex);
}
