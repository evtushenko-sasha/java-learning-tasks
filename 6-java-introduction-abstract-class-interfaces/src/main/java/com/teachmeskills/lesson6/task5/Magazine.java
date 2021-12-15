package com.teachmeskills.lesson6.task5;

public class Magazine implements Printable {

    private String name;

    public Magazine(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("Журнал: " + name);
    }
}
