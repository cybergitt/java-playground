package com.coffeegit.corejava.oop;

public class App 
{
    public static void main( String[] args )
    {
        AddNumbers a1 = new AddNumbers();
        System.out.println(a1.addition(1,2));
        System.out.println(a1.addition(1,2, 3));
        System.out.println(a1.addition(3,4));
    }
}
