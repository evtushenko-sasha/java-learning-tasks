package com.teachmeskills.lesson5.task4;

public class Main {
    public static void main(String[] args) {
        Flat flat1 = new Flat(1, 5, 10, 2, 2, 40.0, "Alex", Sex.F);
        Flat flat2 = new Flat(2, 10, 20, 3, 4, 60.0, "Liza", Sex.M);

        System.out.println(flat1);
        System.out.println(flat2);

        Home home = new Home(10, 3, new Flat[]{flat1, flat2}, "Minsk");

        Flat flat3 = new Flat(3, 9, 23, 4, 10, 80.2, "Masha", ownerSex);

        home.addFlat(flat3);

        System.out.println(flat3);

        home.changeOwner(23, "Liza");

    }
}
