/*
    Problem Statement: 3. Create a class with a constructor that takes a String argument. During construction, print the argument.
    Create an array of object references to this class, but don’t actually create objects to assign into the array.
    When you run the program, notice whether the initialization messages from the constructor calls are printed.
 */

package assignment6;

public class InitialiseConstructorTest {
    private String sentence;

    public InitialiseConstructorTest(String sentence) {
        this.sentence = sentence;
        System.out.println("Constructor called with argument: " + sentence);
    }

    public static void main(String[] args) {
        InitialiseConstructorTest[] classArray = new InitialiseConstructorTest[2];
    }
}


/*

In the main method, we create an array of object references to InitialiseConstructorTest with a length of 2, but we don't actually create objects to assign into the array.
Therefore, no constructor calls are made at this point.
If we were to create objects and assign them to the array, the constructor would be called for each object created.
 */