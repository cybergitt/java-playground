package com.coffeegit.corejava.oop;

public class App 
{
    public static void main( String[] args )
    {
        // create reference variables
        Animal a1;
        Animal a2;
        Animal a3;
        System.out.println("-----No Dynamic method dispatch-----");
        a1 = new Animal();
        a1.eat();
        System.out.println("-----Dynamic method dispatch-----");
        a2 = new Dog();
        a3 = new Puppy();

        a2.eat();
        a3.eat();
    }
}
