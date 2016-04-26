package com.icap.restful.prime.calculator;

import com.icap.restful.prime.calculator.service.PrimeNumberCalculator;
import com.icap.restful.prime.calculator.service.TrialDivisionPrimeNumberCalculator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Rajiv on 19/04/2016.
 */
@Configuration
public class AppConfig {

    @Bean
    public PrimeNumberCalculator primeCalculatorByDivision(){
        return new TrialDivisionPrimeNumberCalculator();
    }
}
