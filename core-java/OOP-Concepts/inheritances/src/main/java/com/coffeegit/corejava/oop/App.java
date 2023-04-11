package com.coffeegit.corejava.oop;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Cat cat = new Cat();

        // call methods from super class
        cat.sleep();
        cat.eat();
        
        // call method from sub class
        cat.meow();

        // get attribute value from super class
        System.out.println("Age : " + cat.age);
    }
}
