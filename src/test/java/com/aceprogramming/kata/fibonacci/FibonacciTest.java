package com.aceprogramming.kata.fibonacci;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FibonacciTest {

    @Test
    void theFibonacciOfZeroIsOne() {
        testFibonacciOf(1, 0);
    }

    @Test
    void theFibonacciOfOneIsOne() {
        testFibonacciOf(1, 1);
    }

    @Test
    void theFibonacciOfTwoIsTwo() {
        testFibonacciOf(2, 2);
    }

    @Test
    void theFibonacciOfThreeIsThree() {
        testFibonacciOf(3, 3);
    }

    @Test
    void theFibonacciOfFourIsFive() {
        testFibonacciOf(5, 4);
    }

    @Test
    void theFibonacciOfFiveIsEight() {
        testFibonacciOf(8, 5);
    }

    @Test
    void theFibonacciOfSixIsThirteen() {
        testFibonacciOf(8, 5);
    }

    void testFibonacciOf(int expected, int input) {
        Assertions.assertEquals(expected, Fibonacci.of(input));
    }
}
