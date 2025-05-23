package com.example;

public class ExerciseMath {
    public static int factorial(int n){
        int result = n;
        if(n <= 0){
            throw new IllegalArgumentException("0以下は不正な値です。");
        }
        if(n==1){
            return 1;
        }
        if(13 <= n){
            throw new IllegalArgumentException("13以上は不正な値です。");
        }
        return n * factorial(n-1);
    }
}
