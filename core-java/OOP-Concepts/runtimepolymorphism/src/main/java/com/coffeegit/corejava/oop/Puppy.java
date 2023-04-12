package com.coffeegit.corejava.oop;

class Puppy extends Dog{
    // dynamic method dispatch happens to this method
    public void eat() {
        System.out.println("Puppy drinks milk");
    }
}
