/*
Problem Statement 1. A vampire number v is a number with an even number of digits n, that can be factored into two numbers x and y each with n/2 digits and not both with trailing zeroes,
 where v contains precisely all the digits from x and from y, in any order. Write a java program to print first 100 vampire numbers.

*/

package assignment6;

import java.util.Scanner;

public class VampireNumbers {
    // Method to check permutation pair, Complexity: Time: O(length of string) Space: O(1)
    private static boolean isPermutation(String factor1, String factor2) {
        int[] digitCounts = new int[10];
        for (int index = 0; index < factor1.length(); index++) {
            digitCounts[factor1.charAt(index) - '0']++;
            digitCounts[factor2.charAt(index) - '0']--;
        }
        for (int count : digitCounts) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        long currentNumber = 10;
        int count = 0;
        Scanner userInput  = new Scanner(System.in);
        System.out.print("How many Vampire no are you want to print?: ");
        // Taking the user input
        Long enteredNumber = userInput.nextLong();
        System.out.println("<== Printing first " + enteredNumber + " Vampire Number ==>");

        // Complexity: Time: O(√n * n) Space: O(1), Where, n is the maximum number of digits of a vampire number.
        while (count < enteredNumber) {
            String currNumberString = Long.toString(currentNumber);
            if (currNumberString.length() % 2 != 0) {
                // The number of digits in the number must be even
                currentNumber++;
                continue;
            }
            for (long factor = 1; factor <= Math.sqrt(currentNumber); factor++) {
                if (currentNumber % factor == 0) {
                    String firstFactor = Long.toString(factor);
                    String secondFactor = Long.toString(currentNumber / factor);
                    String productOfFactors = firstFactor + secondFactor;
                    boolean validLengthFactor = firstFactor.length() == secondFactor.length();
                    // Checking the condition of the Vampire numbers
                    if (isPermutation(currNumberString, productOfFactors) && validLengthFactor) {
                        count++;
                        System.out.println("Vampire number "+ count + ": " + currentNumber + " = " + firstFactor + " * " + secondFactor);
                        break;
                    }
                }
            }
            currentNumber++;
        }
    }

}

