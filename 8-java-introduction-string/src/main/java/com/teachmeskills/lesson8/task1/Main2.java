package com.teachmeskills.lesson8.task1;

public class Main2 {

    public static void main(String[] args) {

        String model = "BMW";
        String index = "320i";
        String number = "4512 AE-7";

        StringBuilder stringBuffer = new StringBuilder("У нас есть авто: ");

        stringBuffer
                .append("Марка ")
                .append(model)
                .append(", index")
                .append(index)
                .append(", номер - ")
                .append(number);

        stringBuffer.insert(16, "Супер");

        System.out.println(stringBuffer);

        stringBuffer.delete(16, 21);
        System.out.println(stringBuffer);
    }
}
