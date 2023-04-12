package com.coffeegit.corejava.oop;

public class AddNumbers {
    // method with 2 integer parameters
    public int addition(int x, int y){
        return x+y;
    }
    // method with 3 integer parameters
    public int addition(int x, int y, int z){
        return x+y+z;
    }
    // method with 2 integer and double parameters
    public int addition(double x, int y){
        return (int)x+y;    //casting
    }
}
