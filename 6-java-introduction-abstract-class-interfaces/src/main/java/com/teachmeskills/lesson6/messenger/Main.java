package com.teachmeskills.lesson6.messenger;

public class Main {

    public static void main(String[] args) {
        Telegram telegram = new Telegram();
        Smartphone smartphone = new Smartphone(telegram);

        Application application = smartphone.getApplication();
        application.printNotification();

        BrowserTab browserTab = new BrowserTab(telegram);
    }
}
