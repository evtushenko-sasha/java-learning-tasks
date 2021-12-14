package com.eval.javaintroduction.narray.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main2 {

    private static Random random = new Random();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите x:");
        int x = scanner.nextInt();
        System.out.println("Введите y:");
        int y = scanner.nextInt();

        int[][] newMatrix = generateMatrix(x, y);
        int[] newMatrix1 = newMatrix[0];
        System.out.println("Матрица:");
        printMatrix(newMatrix);

        transform(newMatrix);
        System.out.println();
        System.out.println("Транспонированная матрица:");
        printMatrix(newMatrix);

        System.out.println("BinarySearch");
        System.out.println(Arrays.binarySearch(newMatrix[1], 0, 3, 99));
        System.out.println("Sort lines");
        sortLines(newMatrix);
        System.out.println("Equals");
        System.out.println(Arrays.equals(newMatrix[0], newMatrix[0]));
        System.out.println(Arrays.equals(newMatrix[0], newMatrix[1]));

        int[] array = new int[]{1, 2, 3};

        array = Arrays.copyOf(array, 10);

        int[] newLine = Arrays.copyOf(newMatrix[2], newMatrix[2].length);
        array =  Arrays.copyOfRange(array, 0, 2);
        System.out.println(Arrays.toString(newMatrix[0]));


    }

    private static void sortLines(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            Arrays.sort(matrix[i]);
        }
    }


    private static int[][] generateMatrix(int x, int y) {
        int[][] matrix = new int[x][]; // x=3 [null, null, null]

        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = new int[y];
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(100);
            }

        }

        return matrix;
    }

    private static void transform(int[][] matrix) {
        int temp;
        if(matrix.length == matrix[0].length) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = i; j < matrix[i].length; j++) {
                    temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
        }

    }


    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            printLine(matrix[i]);
        }
    }



    private static void printLine(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("]");

    }
}
