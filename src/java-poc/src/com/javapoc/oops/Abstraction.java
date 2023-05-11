package com.javapoc.oops;


import java.util.ArrayList;

interface Mobile {
    public void calling(String number);

    public void messaging(String message);
}

class Apple implements Mobile {
    private ArrayList<String> contacts = new ArrayList<String>();

    public void addContacts(String number) {
        contacts.add(number);
    }

    @Override
    public void calling(String number) {
        System.out.println("Calling..." + number);
    }

    @Override
    public void messaging(String message) {
        System.out.println("Sending Message..." + message);
    }
}

public class Abstraction {

    public static void main(String[] args) {
        Apple iphone = new Apple();
        iphone.calling("1234567890");
        iphone.messaging("Hello");
        iphone.addContacts("9102615948");

        SamsungPhone newPhone = new SamsungPhone();
        newPhone.calling("123456789");

    }
}


abstract class MobilePhone {
    ArrayList<String> contacts = new ArrayList<String>();

    abstract void calling(String number);

    abstract void sendMessage(String message);

    public void addContact(String number) {
        contacts.add(number);
    }
}

class SamsungPhone extends MobilePhone {
    @Override
    void calling(String number) {
        System.out.println("Calling from samsung phone to: " + number);
    }

    @Override
    void sendMessage(String message) {
        System.out.println("Sending message from samsung:" + message);
    }
}


/*
Data abstraction is the process of hiding certain details and showing only essential information to the user.
Abstraction can be achieved with either abstract classes or interfaces (which you will learn more about in the next chapter).

The abstract keyword is a non-access modifier, used for classes and methods:

Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).

Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).
An abstract class can have both abstract and regular methods:

 Abstraction: is an act of representing essential features without including the background details or explanations .
Ex: Chat
 Achieved using abstract class or interfaces
 Advantage: Security, enhancement, maintainability, modularity etc.

 */