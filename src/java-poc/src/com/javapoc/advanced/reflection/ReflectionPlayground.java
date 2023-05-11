package com.javapoc.advanced.reflection;

import java.lang.reflect.Method;

class ParentDetails {

}

class Person extends ParentDetails {
    public void show() {
    }

    public void hide() {

    }
}

public class ReflectionPlayground {

    public static void main(String[] args) {
        Person p = new Person();
        // Here, c is reflected copy of p
        Class c = p.getClass(); // Now c will hold all the info. of p object of  class Person
        String className = c.getName();
        System.out.println("Name of class: " + className);

        // Getting all the behaviour of class Person
        Method methods[] = c.getDeclaredMethods();
        System.out.println(methods); // Print the location of methods basics.array like: @edf4efb

        for (Method method : methods) {
            System.out.println("Method name: " + method.getName());
        }
        Class superClass = c.getSuperclass();
        System.out.println("Parent of Person class: " + superClass.getName());


        Class reflectionCopyOfString = String.class;
        System.out.println(reflectionCopyOfString); // class java.lang.String


    }
}




