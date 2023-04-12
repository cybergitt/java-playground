package com.coffeegit.corejava.oop;

public class Dog extends Animal {
    // dynamic method dispatch happens to this method
    public void eat() {
        System.out.println("Dog eats meat");
    }
}
