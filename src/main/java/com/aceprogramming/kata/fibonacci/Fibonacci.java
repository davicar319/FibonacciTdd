package com.aceprogramming.kata.fibonacci;

public class Fibonacci {
    public static int of(int i) {
        return i < 2 ? 1 : of(i-2) + of(i-1);
    }
}
