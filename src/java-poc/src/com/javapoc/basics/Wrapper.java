package com.javapoc.basics;

public class Wrapper {
    public static void main(String[] args) {
        Integer myInt = 5;
        String myString = myInt.toString();
        System.out.println(myString.length());
        System.out.println(myInt);

    }
}



/*
Java Wrapper Classes:
    Wrapper classes provide a way to use primitive data types (int, boolean, etc..) as objects.
    Primitive Data Type	Wrapper Class
    byte	             Byte
    short              	Short
    int	                Integer
    long	            Long
    float	            Float
    double          	Double
    boolean         	Boolean
    char	            Character

Usecase: Sometimes you must use wrapper classes, for example when working with Collection objects, such as ArrayList, where primitive types cannot be used (the list can only store objects)

ArrayList<int> myNumbers = new ArrayList<int>(); // Invalid
ArrayList<Integer> myNumbers = new ArrayList<Integer>(); // Valid

Method: toString() method, which is used to convert wrapper objects to strings.


 */
