package com.aceprogramming.kata.fibonacci;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.math.BigInteger;
import java.time.Duration;

public class FibonacciTest {
    @ParameterizedTest(name = "Fibonacci of {1} is {0}")
    @CsvSource({
            "1,0",
            "1,1",
            "2,2",
            "3,3",
            "5,4",
            "8,5",
            "13,6"})
    void testFibonacciOf(BigInteger expected, BigInteger input) {
        Assertions.assertEquals(expected, Fibonacci.of(input));
    }

    @Test
    void timedTest() {
        Assertions.assertTimeout(Duration.ofMillis(25),
                () -> System.out.println(Fibonacci.of(BigInteger.valueOf(2000))));
    }
}
