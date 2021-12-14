package com.eval.javaintroduction.array.example;

public class TernaryOperatorExample {

    public static void main(String[] args) {
        int x = 5;
        int y = 10;

        int minValue = x < y ? x : y;
        int maxValue = x > y ? x : y;

        System.out.println("Minimum value is " + minValue);
        System.out.println("Maximum value is " + maxValue);
    }
}
