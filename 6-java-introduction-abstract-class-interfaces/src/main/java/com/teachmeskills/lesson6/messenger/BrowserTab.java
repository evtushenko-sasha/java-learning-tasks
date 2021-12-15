package com.teachmeskills.lesson6.messenger;

public class BrowserTab {

    private Messenger messenger;

    public BrowserTab(Messenger messenger) {
        this.messenger = messenger;
    }

    public void viewMessages() {
        messenger.getMessage();
    }
}
