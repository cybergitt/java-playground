package com.coffeegit.corejava.oop;

import com.coffeegit.corejava.oop.abstracts.Circle;
import com.coffeegit.corejava.oop.abstracts.Rectangle;
import com.coffeegit.corejava.oop.abstracts.Shape;
import com.coffeegit.corejava.oop.interfaces.EmailNotification;
import com.coffeegit.corejava.oop.interfaces.SMSNotification;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("## Implementation of Abstract Class ##");
        Shape s1 = new Circle("Red", 2.2);
        Shape s2 = new Rectangle("Yellow", 2, 4);
 
        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println();
        
        EmailNotification emailNotification = new EmailNotification();
        SMSNotification smsNotification = new SMSNotification();

        System.out.println("## Implementation of Interface ##");
        emailNotification.sendNotification();
        smsNotification.sendNotification();

    }
}
