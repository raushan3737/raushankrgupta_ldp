package com.javapoc.oops;


interface InterfaceDemo {
    static final String str = "Static constant";

    public void m1();

    public int m2();

    static void m3() {
    }

    ;

    default int m4() {
        return 0;
    }

    private void m5() {
    }

    ;
}

abstract class InterfaceDetails implements InterfaceDemo {
    @Override
    public void m1() {
        System.out.println("m1 method");
    }
}

class FinalImplementation extends InterfaceDetails {

    @Override
    public int m2() {
        System.out.println("m2 method");
        return 0;
    }
}

public class AbstractAndInterface {

    public static void main(String[] args) {
        System.out.println("Main method");
        FinalImplementation demo = new FinalImplementation();
        System.out.println(demo.m2());
    }
}


/*

Abstract Class: are classes with incomplete implementation.
Can't be instantiated, can have abstract & concrete methods.
 Abstract keywords required in declaration of abstract method.
Can have static,final or static or static final variables with any access specifier.

Syntax:
abstract class AbstractClass{

}


Interface: is a blueprint of class, specifies what a class must do(not how).
Only have method declarations, Kind of Service requirement specification which will class have.
 All data members will always static & final & public.
Can have abstract methods, static,default,private methods.
Pure abstract class
Can only have static final variable by default.

Syntax:
<modifier> interface oops.InterfaceDemo{
    public void m1();
    public  void m2();
}
 */