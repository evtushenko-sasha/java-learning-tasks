package com.teachmeskills.lesson5.task3;

public class Person {
    public int id;
    public static int counter = 1;

    public Person() {
        id = counter++;
    }
}
