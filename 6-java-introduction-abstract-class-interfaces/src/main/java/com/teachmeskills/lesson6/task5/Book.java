package com.teachmeskills.lesson6.task5;

public class Book implements Printable {

    private String name;
    private String author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    @Override
    public void print() {
        System.out.println("Книга: " + name);
    }

    @Override
    public void fullPrint() {
        System.out.println("Книга: " + name+ " Автор: " + author);
    }
}
