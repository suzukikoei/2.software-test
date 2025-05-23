package com.example.tdd;

public class ExersiceMath2 {
    public int factorial(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("0以下は不正な値です。");
        }
        if (n == 1) {
            return 1;
        }
        if (n >= 13) {
            throw new IllegalArgumentException("13以上は不正な値です。");
        }
        return n * factorial(n - 1);
    }
}
