package com.teachmeskills.lesson7.task1;

public class Pizza extends Food implements Printable {

    public Pizza(Integer weight, String name) {
        super(weight, name);
    }

    @Override
    public String getTypeHowToEat() {
        return "Руками";
    }

    public void printDetails() {
        System.out.println("details");
    }

    @Override
    public void print() {
        System.out.println("Message");
    }

    @Override
    public String toString() {
        return "Pizza{} " + super.toString();
    }
}
