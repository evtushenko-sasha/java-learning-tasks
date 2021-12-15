package com.teachmeskills.lesson6.task5;

public interface Printable {

    void print();

    default void fullPrint() {
        System.out.println("Мы выводим всю информацию!");
    }
}
