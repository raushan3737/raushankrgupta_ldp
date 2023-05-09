/*
Problem Statement: Error Handling
    Create three new types of exceptions. Write a class with a method that throws all three. In main( ), call the method but only use a single catch clause that will catch all three types of exceptions.
    Add a finally clause and verify that your finally clause is executed, even if a NullPointerException is thrown.
 */

package assignment8;

public class ExceptionThrower {
    public static void throwAllExceptions() throws Exception1, Exception2, Exception3 {
        // Generating the random number to throw only one exception at a time
        int randomNum = (int) (Math.random() * 3); // generate a random number between 0 and 2
        if (randomNum == 0) {
            throw new Exception1("Exception1");
        } else if (randomNum == 1) {
            throw new Exception2("Exception2");
        } else {
            throw new Exception3("Exception3");
        }
    }

    public static void main(String[] args) {
        try {
            ExceptionThrower.throwAllExceptions();
        } catch (Exception e) {
            System.out.println("Catch: ");
            System.out.println("Caught an exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed");
        }
    }
}
