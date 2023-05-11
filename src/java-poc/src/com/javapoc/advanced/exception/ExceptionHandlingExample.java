package com.javapoc.advanced.exception;

public class ExceptionHandlingExample {
    public static void checkUpperCase(String data) throws CaseException {
        if (data.equals(data.toLowerCase())) {
            System.out.println("Data is in valid case");
        } else {
            // Some code that may throw a CaseException...
            throw new CaseException("Case is not in UpperCase!");
        }

    }

    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }

    public static void main(String[] args) {
        /*
         int[] myNumbers = {1, 2, 3};
        System.out.println(myNumbers[10]); // error!
        // java.lang.ArrayIndexOutOfBoundsException
         */

//        checkAge(15);
        String str = "Hello";
        try {
            checkUpperCase(str);
        } catch (CaseException e) {
            System.out.println("Caught CustomException: " + e.getMessage());
            e.printStackTrace();
        }

//        try {
//            int[] myNumbers = {1, 2, 3};
//            System.out.println(myNumbers[10]);
//        } catch (Exception e) {
//            System.out.println("Something went wrong.");
//        } finally {
//            System.out.println("The 'try catch' is finished.");
//        }


    }
}
