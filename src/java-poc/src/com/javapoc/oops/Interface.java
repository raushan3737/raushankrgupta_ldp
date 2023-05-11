package com.javapoc.oops;

// Level 1
interface Bank {
    void deposit();

    void withdraw();

    void loan();

    void account();
}

// Level 2
abstract class Dev1 implements Bank {
    public void deposit() {
        System.out.println("Your deposit Amount :" + 100);
    }
}

abstract class Dev2 extends Dev1 {
    public void withdraw() {
        System.out.println("Your withdraw Amount :" + 50);
    }
}

// Level 3
class Dev3 extends Dev2 {
    public void loan() {
        System.out.println("loan method");
    }

    public void account() {
        System.out.println("account method");
    }
}

// Level 4
public class Interface {
    public static void main(String[] args) {
        Dev3 d = new Dev3();
        d.account();
        d.loan();
        d.deposit();
        d.withdraw();
    }
}

/*
 Java Program to demonstrate Interface
An interface in Java is a blueprint of a behaviour. A Java interface contains static constants and abstract methods.
Like a class, an interface can have methods and variables, but the methods declared in an interface are by default abstract (only method signature, no body).

 */