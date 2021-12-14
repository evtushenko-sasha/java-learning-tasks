package com.eval.javaintroduction.array.example;

import java.util.Random;
import java.util.Scanner;

public class NumberGenerator {

    private static final Random random = new Random();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество чисел, которые нужно сгенерировать:");

        int[] array = generateArray(scanner.nextInt());

        System.out.println("Сгенерированные числа:");

        for (int i = 0; i < array.length; i++) {
            System.out.println(i + ") " + array[i]);

        }

//        for (int generatedNumber : array) {
//            System.out.println(generatedNumber);
//        }

    }

    private static int[] generateArray(int count) {
        int[] generatedArray = new int[count];

        for (int i = 0; i < count; i++) {
            generatedArray[i] = random.nextInt();
        }
        return generatedArray;
    }
}
