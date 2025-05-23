package com.example;

public class MathUtilMain {
    public static void main(String[] args) {
        double answer1 = MathUtil.power(1,2);
        System.out.println(answer1);

        double answer2 = MathUtil.power(20,0);
        System.out.println(answer2);

        double answer3 = MathUtil.power(3,10);
        System.out.println(answer3);

        double answer4 = MathUtil.power(0,0);
        System.out.println(answer4);
    }
}
