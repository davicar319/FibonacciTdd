package com.aceprogramming.kata.fibonacci;

import java.math.BigInteger;
import java.util.WeakHashMap;

public class Fibonacci {
    public static BigInteger of(BigInteger i) {
        return memoizedFibonacciOf(i);
    }

    private static WeakHashMap<BigInteger, BigInteger> fibMemo = new WeakHashMap<>();
    private static BigInteger memoizedFibonacciOf(BigInteger i) {
        if(fibMemo.containsKey(i)) {
            return fibMemo.get(i);
        } else {
            return calculateFibonacci(i);
        }
    }

    private static BigInteger calculateFibonacci(BigInteger i) {
        var fib =  i.compareTo(BigInteger.TWO) < 0 ?
                BigInteger.ONE :
                of(i.subtract(BigInteger.TWO)).add(of(i.subtract(BigInteger.ONE)));
        fibMemo.put(i, fib);
        return fib;
    }
}
