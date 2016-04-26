package com.icap.restful.prime.calculator.controller;

import com.icap.restful.prime.calculator.model.PrimeNumbers;
import com.icap.restful.prime.calculator.service.PrimeNumberCalculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Rajiv on 18/04/2016.
 */
@RestController
@RequestMapping(path="/primes")
public class PrimeNumberCalculatorController {
    @Autowired
    private PrimeNumberCalculator primeCalculatorByDivision;
    @Autowired
    private PrimeNumberCalculator primeCalculatorByEratosthenesSieve;

    @RequestMapping(value="/division/{num}", produces={"application/json"}, consumes= MediaType.ALL_VALUE)
    public PrimeNumbers primesByDivision(@PathVariable Integer num) {
        List<Integer> primes = primeCalculatorByDivision.calculatePrimes(num);
        return new PrimeNumbers(num, primes);
    }

    @RequestMapping(value="/sieve/{num}", produces={"application/json"}, consumes= MediaType.ALL_VALUE)
    public PrimeNumbers primesByEratosthenesSieve(@PathVariable Integer num) {
        List<Integer> primes = primeCalculatorByEratosthenesSieve.calculatePrimes(num);
        return new PrimeNumbers(num, primes);
    }
}
