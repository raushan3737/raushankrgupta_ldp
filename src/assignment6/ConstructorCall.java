/*
Problem Statement: 2. Create a class with two (overloaded) constructors. Using this, call the second constructor inside the first one.
 */
package assignment6;

public class ConstructorCall {
    private String name;
    private int id;

    public ConstructorCall(String name) {
        this(name, 2);
    }

    public ConstructorCall(String name, int id) {
        System.out.println("Constructor: " + name + " " + id);

    }

    public static void main(String[] args) {
        ConstructorCall constructorCall = new ConstructorCall("constructor");

    }
}
