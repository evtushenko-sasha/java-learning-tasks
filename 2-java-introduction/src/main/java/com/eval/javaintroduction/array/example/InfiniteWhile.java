package com.eval.javaintroduction.array.example;

public class InfiniteWhile {

    public static boolean BOOLEAN = true;

    public static void main(String[] args) throws InterruptedException {
        int i = 0;
        while (true) {
            System.out.println("Program running " + i++ + "sec");
            Thread.sleep(1);
        }
    }

}
