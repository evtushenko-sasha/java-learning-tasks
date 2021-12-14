package com.eval.javaintroduction.array.example;

public class While {

    public static void main(String[] args) {

        int gas = 100;
        int gasPerCar = 15;

        int count = 1;

        do {
            gas -= gasPerCar;
            System.out.println("Машина номер: " + count + "\n Бензина осталось:" + gas);
            count++;
        } while (gas > gasPerCar);
        System.out.println("Бензин закончился!");

    }
}
