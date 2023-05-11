package com.javapoc.basics;

public class TypeCasting {
    public static void main(String[] args) {
        //Widening Casting
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double

        System.out.println(myInt);      // Outputs 9
        System.out.println(myDouble);   // Outputs 9.0

//        Narrowing Casting
        double myDoublee = 9.78d;
        int myIntt = (int) myDouble; // Manual casting: double to int

        System.out.println(myDoublee);   // Outputs 9.78
        System.out.println(myIntt);      // Outputs 9
    }

}
