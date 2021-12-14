package com.eval.javaintroduction.array.example;

import java.util.Scanner;

public class NumbersFiller {

    private static final Scanner scanner = new Scanner(System.in);

    private static int[] numbers;

    public static void main(String[] args) {
        System.out.println("Введите количество чисел:");

        int count = scanner.nextInt();

        numbers = new int[count];

        for (int i = 0; i < count; i++) {
            System.out.println("Введите число № - " + (i+1));
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Введенные числа:");
        for (int number : numbers) {
            System.out.println(number);
        }

    }
}
