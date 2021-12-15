package com.teachmeskills.lesson6.messenger;

public class Viber implements Messenger, Application {

    @Override
    public void sendMessage() {
        System.out.println("отправлено сообщение через Viber");
    }

    @Override
    public void getMessage() {
        System.out.println("получено сообщение через Viber");
    }

    @Override
    public void printNotification() {
        System.out.println("Получено сообщение");
    }
}
