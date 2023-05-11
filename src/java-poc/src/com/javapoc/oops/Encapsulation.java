package com.javapoc.oops;

class Account{
    private double balance; // Data Hiding
    public void setBalance(double balance) // Hiding the internal details/implementations
    {
//        Validation
        this.balance = balance;
    }
    public double getBalance() {
//        User validation
        return this.balance;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        System.out.println("<===Encapsulation===>");
        Account acc = new Account();
        acc.setBalance(10000);
        System.out.println(acc.getBalance());
    }
}


/*
Encapsulation in Java is a process of wrapping code and data together into a single unit, for example, a capsule which is mixed of several medicines.

encapsulation in java
We can create a fully encapsulated class in Java by making all the data members of the class private. Now we can use setter and getter methods to set and get the data in it.

Encapsulation:  Grouping up of data members and member functions in a single unit is called Encapsulation.
Combination of data hiding & abstraction
Ex: Java class
 If any components have  Data Hiding + Abstraction = Encapsulation.

Tightly Encapsulated Class: If a class have each & every data member is private
 */