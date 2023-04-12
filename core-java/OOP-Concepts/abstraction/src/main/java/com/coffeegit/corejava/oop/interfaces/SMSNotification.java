package com.coffeegit.corejava.oop.interfaces;

public class SMSNotification implements INotification {

    @Override
    public void sendNotification() {
        System.out.println("Send SMS notification");
    }
    
}
