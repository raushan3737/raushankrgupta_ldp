/*
Problem Statement: Create a class in a package yourname.assignment.data containing an int and a char member variables that are not initialized,
add a method to print these variables. Add another method in the same class with two local variables and print their values without initializing them.
 */

package assignment5.raushan.assignment.data;

public class VariableInitialiser {
    private char data;
    private int value;

    public void printInstanceVariable() {
        System.out.println("Instance variables are: " + data + " " + value);
    }

    public void printLocalVariable() {
//        int id;
//        char ch;
//        System.out.println("Local variables without initialisation: " + id + " " + ch);

        // Local variables have not been initialized, the code will not compile and will result in a compilation error.
        // To fix this error, we have to initialize the variables
    }
}

