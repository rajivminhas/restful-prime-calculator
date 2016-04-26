package com.icap.restful.prime.calculator.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Created by Rajiv on 25/04/2016.
 */
public class EratosthenesSievePrimeNumberCalculator implements PrimeNumberCalculator {

    @Override
    public List<Integer> calculatePrimes(Integer number) {
        //create array with index as numbers and value as indicative of prime
        boolean[] primes = new boolean[number];
        IntStream.range(2, number).forEach(x->primes[x]=true);

        IntStream.rangeClosed(2, (int) Math.sqrt(number)).filter(x->primes[x]).forEach(x -> {
                for(int j=x*x; j<number; j+=x){
                    primes[j] = false;
                }
        });
        //all index with values as true are prime
        final List<Integer> ls = new ArrayList<>(primes.length);
        IntStream.range(0,primes.length).filter(x->primes[x]).forEach(x-> ls.add(x));
        return ls;
    }

}
