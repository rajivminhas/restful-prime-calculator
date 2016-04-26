package com.icap.restful.prime.calculator.model;

import java.util.List;

/**
 * Created by Rajiv on 18/04/2016.
 */
public class PrimeNumbers {
    private Integer number;
    private List<Integer> primes;

    public PrimeNumbers() {
    }

    public PrimeNumbers(Integer number, List<Integer> primes) {
        this.number = number;
        this.primes = primes;
    }

    public Integer getNumber() {
        return number;
    }

    public void setMaxNum(Integer number) {
        this.number = number;
    }

    public List<Integer> getPrimes() {
        return primes;
    }

    public void setPrimes(List<Integer> primes) {
        this.primes = primes;
    }
}
