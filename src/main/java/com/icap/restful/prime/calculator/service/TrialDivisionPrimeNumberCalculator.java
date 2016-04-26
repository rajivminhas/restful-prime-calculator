package com.icap.restful.prime.calculator.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

/**
 * Created by Rajiv on 18/04/2016.
 */
public class TrialDivisionPrimeNumberCalculator implements PrimeNumberCalculator {

    private static Logger LOG = Logger.getLogger(TrialDivisionPrimeNumberCalculator.class.getName());

    @Override
    public List<Integer> calculatePrimes(Integer number) {
        LOG.info("Calculating primes by TrialDivision.....");
        final List<Integer> primes = new ArrayList<>();
        IntStream.range(2, number)
                .filter(x->IntStream.rangeClosed(2, (int)(Math.sqrt(x))).allMatch(n->x%n != 0))
                .forEach(primes::add);
        Collections.sort(primes);
        return primes;
    }

}
