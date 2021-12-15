package com.teachmeskills.lesson6.messenger;

public class Telegram implements Messenger, Application {
    @Override
    public void sendMessage() {
        System.out.println("отправлено сообщение через Telegram");
    }

    @Override
    public void getMessage() {
        printNotification();
        System.out.println("получено сообщение через Telegram");
    }

    @Override
    public void printNotification() {
        System.out.println("нотификация");
    }
}
