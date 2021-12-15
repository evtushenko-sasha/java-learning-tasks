package com.teachmeskills.lesson6.task5;

public class Main {
    public static void main(String[] args) {

        Printable printable1 = createPrintable("1", true);
        Printable printable2 = createPrintable("2", false);

        printable1.print();
        printable2.print();

        printable1.fullPrint();
        printable2.fullPrint();
    }

    private static Printable createPrintable(String name, boolean option) {
        if(option) {
            return new Book(name, "Alina");
        } else {
            return new Magazine(name);
        }
    }
}
