package com.eval.javaintroduction.array.example;

public class ForLoop {
    public static void main(String[] args) {
        String[] weekDays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        System.out.println("Simple for cycle\n");

        for (int counter = 0; counter < weekDays.length; counter++) {
            System.out.println(weekDays[counter]);
        }

        System.out.print("\n\n");
        System.out.println("For each cycle\n");
        for (String weekDay : weekDays) {
            System.out.println(weekDay);
        }
    }
}
