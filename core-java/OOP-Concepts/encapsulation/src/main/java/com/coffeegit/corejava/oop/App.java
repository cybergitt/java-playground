package com.coffeegit.corejava.oop;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Products products = new Products();
        products.setId(1);
        products.setCode("ABC");
        products.setName("Baterai AAA");
        products.setPrice(12000);

        System.out.println( products.getDescription("ABC") );
    }
}
