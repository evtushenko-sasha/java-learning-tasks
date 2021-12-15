package com.teachmeskills.lesson6;

public abstract class Person {
    protected String name;

    public Person(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println(name);
    }
}
