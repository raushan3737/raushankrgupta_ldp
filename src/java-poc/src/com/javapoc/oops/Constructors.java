package com.javapoc.oops;


public class Constructors {
    private String name;

    public Constructors() {
        // Calling the another constructor from the constructor, Must be the 1st line
        this("Hi");
//        this("Hello"); // Not allowed
        System.out.println("Non-Parametrised constructor");
    }

    public Constructors(String name) {
        this.name = name;
        System.out.println("Parametrised constructor with message: " + name);
    }

    public static void main(String[] args) {
        Constructors nonParaConstructor = new Constructors();
        Constructors paraConstructor = new Constructors("Hello");
    }
}

/*
Constructor: It is a special method with name as class name with public access specifier.
It runs everytime whenever we create the object of that class.
It doesn't have return type.
Use: To initialise the all instance variable

 */
