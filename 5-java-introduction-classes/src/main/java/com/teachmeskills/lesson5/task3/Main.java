package com.teachmeskills.lesson5.task3;

import java.util.function.Predicate;

public class Main {


    public static void main(String[] args) {
        Person max = new Person();
        Person alex = new Person();
        Person alex2 = new Person();

        Person.counter = 5;

        Person max2 = new Person();
        Person max3 = new Person();
        Person max4 = new Person();
        Person max5 = new Person();

        System.out.println("Max id = " + max.id);
        System.out.println("Alex id = " + alex.id);
        System.out.println("Alex2 id = " + alex2.id);
        System.out.println("Max2 id = " + max2.id);
        System.out.println("Max3 id = " + max3.id);
        System.out.println("Max4 id = " + max4.id);
        System.out.println("Max5 id = " + max5.id);

    }
}
