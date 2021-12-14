package com.eval.javaintroduction.array.example;

public class Main {
    private int[] ratings;
    private String[] names = new String[10];
    private String[] vegetables = {"Watermelon", "Apple",};

    public static void main(String[] args) {
        Main main = new Main();
        main.ratings = new int[10];
    }

    private static int getIndexOfElement(int element, int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == element) {
                return i;
            }
        }
//        Таким образом можно обрабатывать случай, когда нет элемента, или кидать Exception
//        throw new RuntimeException("Element not found");
        return -1;
    }

    private static int getSumArrayElements(int[] numbers) {
        int total = 0;

        for (int element : numbers) {
            total += element;
        }
        return total;
    }

    private static int getMaxElement(int[] numbers) {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) max = numbers[i];
        }
        return max;
    }

}
