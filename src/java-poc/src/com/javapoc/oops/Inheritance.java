package com.javapoc.oops;

// Java program to demonstrate the  real-world example of Interfaces
interface Vehicle {

    // all are the abstract methods.
    void changeGear(int a);
    void speedUp(int a);
    void applyBrakes(int a);
}

class Bicycle implements Vehicle{

    int speed;

    int gear;

    // to change gear
    @Override
    public void changeGear(int newGear){

        gear = newGear;
    }

    // to increase speed
    @Override
    public void speedUp(int increment){

        speed = speed + increment;
    }

    // to decrease speed
    @Override
    public void applyBrakes(int decrement){

        speed = speed - decrement;
    }

    public void printStates() {
        System.out.println("speed: " + speed
                + " gear: " + gear);
    }
}

class Bike implements Vehicle {

    int speed;
    int gear;

    // to change gear
    @Override
    public void changeGear(int newGear){

        gear = newGear;
    }

    // to increase speed
    @Override
    public void speedUp(int increment){

        speed = speed + increment;
    }

    // to decrease speed
    @Override
    public void applyBrakes(int decrement){

        speed = speed - decrement;
    }

    public void printStates() {
        System.out.println("speed: " + speed
                + " gear: " + gear);
    }

}
public class Inheritance {
    public static void main (String[] args) {
        // creating an instance of Bicycle
        // doing some operations
        Bicycle bicycle = new Bicycle();
        bicycle.changeGear(2);
        bicycle.speedUp(3);
        bicycle.applyBrakes(1);

        System.out.println("Bicycle present state :");
        bicycle.printStates();

        // creating instance of the bike.
        Bike bike = new Bike();
        bike.changeGear(1);
        bike.speedUp(4);
        bike.applyBrakes(3);

        System.out.println("Bike present state :");
        bike.printStates();
    }
}


//1.Single Inheritance
class Parent{

}
class Child extends Parent {

}

//2.Multilevel Inheritance
class GrandChildren extends  Child{

}

/*3.Multiple Inheritance: (More than 1 parent)Not supported with the help of class in java. It causes diamond ambiguity problem.
If class c extends two class A & B & if A & B has a method with name m() so, in the runtime there is a ambiguity problem that which method should call.
*/


interface I1{
    default void method(){
        System.out.println("Method of I1");
    }
}

interface I2{
    default void method(){
        System.out.println("Method of I2");
    }
}

class MultipleInheritance implements I1 , I2{
    @Override
    public void method() {
        I1.super.method();
    }
}


/*4.Hierarchical Inheritance: When a single base have different child classes.
 Parentt => Childd , SiblingChild  Single Parent more than one child
*/

class Parentt{

}
class Childd extends Parentt {

}

class SiblingChild extends Parentt{

}

/*
5.Hybrid Inheritance: Multiple + Multilevel Inheritance. Not supported by java
 */



/*
Inheritance: Mechanism to create new class, deriving the old class.
Represent IS-A relationship.
Example:

Types of Inheritance:
1.Single Inheritance
2.Multilevel Inheritance
3.Multiple Inheritance
4.Hierarchical Inheritance
5.Hybrid Inheritance

*/
