package com.teachmeskills.lesson5.task1;

public class Main1 {
    public static void main(String[] args) {
        Dog max = new Dog(3, "Max");

        System.out.println(max.age);
        System.out.println(max.type);

        max.printAgeAndName();
        max.saySomething();
    }
}
