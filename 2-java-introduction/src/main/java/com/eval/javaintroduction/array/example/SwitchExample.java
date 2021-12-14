package com.eval.javaintroduction.array.example;

import java.time.LocalDate;

public class SwitchExample {
    public static void main(String[] args) {
        printDayOfWeek();
    }

    private static void printDayOfWeek() {
        switch (LocalDate.now().getDayOfWeek()) {
            case MONDAY:
                System.out.println("Сегодня понедельник, нужно на работу(");
                break;
            case TUESDAY:
                System.out.println("Сегодня вторник");
                break;
            case WEDNESDAY:
                System.out.println("Сегодня среда, уже прошла половина рабочей недели");
                break;
            case THURSDAY:
                System.out.println("Сегодня четверг");
                break;
            case FRIDAY:
                System.out.println("И вот долгожданная пятница!");
                break;
            case SATURDAY:
                System.out.println("Сегодня суббота, первый выходной");
                break;
            case SUNDAY:
                System.out.println("Воскресенье, завтра на работу(");
                break;
        }
    }
}
