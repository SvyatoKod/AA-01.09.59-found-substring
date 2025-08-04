package org.submarine.service.uniqnumber;

import org.submarine.converter.uniqnumber.primenumber.ConverterPrimeNumbers;

/**
 * Сервис для нахождения подстроки с учетом перестановки в строке.
 *
 * @author SvyatoKod
 */
public class FoundSubStringByUniqPrimeNumbersService extends FoundSubStringByUniqNumberService {

    public FoundSubStringByUniqPrimeNumbersService() {
        super(new ConverterPrimeNumbers());
    }
}
