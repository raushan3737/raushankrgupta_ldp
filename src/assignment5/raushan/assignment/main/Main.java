/*
Problem Statement: Create main class in package yourname.assignment.main, create object of first class and call both the methods to print the values.
Create object of second class using static method and then call the other method to print the String.
 */

package assignment5.raushan.assignment.main;

import assignment5.raushan.assignment.data.VariableInitialiser;
import assignment5.raushan.assignment.singleton.PrintByStaticMethod;

public class Main {
    public static void main(String[] args) {
        VariableInitialiser varInit = new VariableInitialiser();
        // Demonstrating DefaultInitialization,  Global variable will, can get the default value
        varInit.printInstanceVariable();
        // Local variables can't get initialised with default value
        // varInit.printLocalVariable();

        // Static method can only access static variable
        String message = "Welcome";
        PrintByStaticMethod printVar = new PrintByStaticMethod(message);
        PrintByStaticMethod.messageObject(message);
        printVar.print();
    }
}
