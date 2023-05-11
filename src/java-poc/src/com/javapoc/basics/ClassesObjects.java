package com.javapoc.basics;

class Methods {
    String animal;
    int value, month;

    void run() {
        System.out.println("Running...");
        for (int i = 0; i < 5; i++) {
            System.out.println("My " + animal + " is " + value + " years old.");
        }
    }

    int calculateMonthsToBirthday() {
        int monthsLeft = 12 - month;
        return monthsLeft;
    }

    void talk(String text) {
        System.out.println(text);
    }
}

public class ClassesObjects {
    public static void main(String[] args) {
        // Class, Methods, Objects, Return Types and Method Parameters
        Methods name = new Methods();
        name.animal = "Dog";
        name.value = 54;
        name.month = 5;
        name.run();
        System.out.println(name.calculateMonthsToBirthday() + " Months left for my birthday!");
        name.talk("Hey, I am Anuj!");
    }
}

