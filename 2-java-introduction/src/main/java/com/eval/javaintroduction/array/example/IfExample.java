package com.eval.javaintroduction.array.example;

import java.util.Scanner;

public class IfExample {

    private static Shop zara = new Shop(true, "Zara");
    private static Shop bershka = new Shop(false, "Bershka");
    private static final int AGE_OF_MAJORITY = 18;

    public static void main(String[] args) {
        while (!isAdultOrNot()){
            System.out.println("Доступ запрещен!!!");
        }
        System.out.println("Вы можете продолжить)))");
    }

    private static boolean isAdultOrNot() {
        System.out.println("Введите ваш возраст:");
        int yourAge = new Scanner(System.in).nextInt();
        if (yourAge >= AGE_OF_MAJORITY) {
            System.out.println("Ты совершеннолетний");
            return true;
        } else {
            System.out.println("Ты еще не совершеннолетний");
            return false;
        }
    }


    private static void goToShops() {

        if (zara.isWorkingNow() && bershka.isWorkingNow()) {
            System.out.println("Идем на шопинг");
        } else {
            System.out.println("Остаемся дома");
        }
    }

    private static void goToShop() {

        if (zara.isWorkingNow() && bershka.isWorkingNow()) {
            System.out.println("Идем на шопинг во все магазины!!!");
        } else if (zara.isWorkingNow()) {
            System.out.println("Идем на шопинг в зару!");
        } else if (bershka.isWorkingNow()) {
            System.out.println("Идем на шопинг в бершку!");
        } else {
            System.out.println("Остаемся дома :(");
        }
    }


}
