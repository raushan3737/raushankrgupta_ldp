package com.javapoc.oops;

// Java program for Method Overloading by Using Different Numbers of Arguments

class Helper {

    // Method 1
    // Multiplication of 2 numbers
    static int Multiply(int a, int b) {
        return a * b;
    }

    // Method 2
    // // Multiplication of 3 numbers
    static int Multiply(int a, int b, int c) {
        return a * b * c;
    }
}

class OverloadingDemo {
    public static void main(String[] args) {
        // Calling method by passing
        // input as in arguments
        System.out.println(Helper.Multiply(2, 4));
        System.out.println(Helper.Multiply(2, 7, 3));
    }
}


// Java Program for Method Overriding
class Base {
    public void show() {
        System.out.println("show of base");
    }
}

class Derived extends Base {
    public void show() {
        System.out.println("show of derived");
    }
}

class OverridingDemo {
    public static void main(String[] args) {
        Base base = new Base();
        base.show(); // Will call Base class method
        Derived der = new Derived();
        der.show(); //  Will call derived class method else base

        Base obj = new Derived();
        obj.show(); // Will call derived class method

//        Derived obj2 = new Base(); // Not allowed

    }
}



/*
Promotion Rule: byte -> short -> int -> long -> float -> double
                                  ^
                                  |
                                 char

Method signatures: Used by compilers to resolve method calls. Return type is not part of it.
Syntax: <Method name> (<Argument types>)
Polymorphism: is a concept by which we can perform a single action in different ways.
Types:
    1.Method Overloading(Early Binding, Compile time, Static): Can have multiple method with same name with different arguments in a class
    Can have different method in a class with same name but with different signatures.

Application:
getDetails(int id, String name)
getDetails(int id,String name ,String password)

Advantages:
increases the readability of the program.
provides flexibility to programmers so that they can call the same method for different types of data.

2.Method Overriding: allows a sub-class to provide an implementation to the method that is provided by it's base class.
Method resolution will be done by JVM based on object type.
Type of the referred object determines which version of an overridden method will be executed.

*/
