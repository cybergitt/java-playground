package com.coffeegit.corejava.oop.interfaces;

public class EmailNotification implements INotification {

    @Override
    public void sendNotification() {
        System.out.println("Send Email notification");
    }
    
}
