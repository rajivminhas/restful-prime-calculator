package com.icap.restful.prime.calculator.service;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Rajiv on 25/04/2016.
 */
public class TrialDivisionPrimeNumberCalculatorTest {
    private PrimeNumberCalculator tested;

    @Before
    public void setUp() throws Exception {
        tested = new TrialDivisionPrimeNumberCalculator();
    }

    @Test
    public void testCalculatePrimesNone() throws Exception {
        List<Integer> actual = tested.calculatePrimes(1);

        assertEquals(Collections.EMPTY_LIST, actual);
    }

    @Test
    public void testCalculatePrimesSmall() throws Exception {
        List<Integer> actual = tested.calculatePrimes(5);

        assertEquals(Arrays.asList(2,3), actual);
    }

    @Test
    public void testCalculatePrimesLarger() throws Exception {
        List<Integer> actual = tested.calculatePrimes(20);

        assertEquals(Arrays.asList(2,3,5,7,11,13,17,19), actual);
    }

    @Test
    public void testCalculatePrimesOne() throws Exception {
        List<Integer> actual = tested.calculatePrimes(3);

        assertEquals(Arrays.asList(2), actual);
    }

    @Test
    public void testCalculatePrimesThousand() throws Exception {
        List<Integer> actual = tested.calculatePrimes(1000);

        assertEquals(168, actual.size());
    }
}