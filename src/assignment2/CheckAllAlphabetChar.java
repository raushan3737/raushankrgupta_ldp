/*
Problem Statement: Write a java function that checks if the input string contains all the letters of the alphabet a-z (case-insensitive).
Write time and space complexity of your solution as comments in the source file.
*/

package assignment2;

import java.util.Scanner;

public class CheckAllAlphabetChar {
    // Complexity: Time: O(n) , Space: O(1) Where, n is the length of the entered string
    public static boolean containsAllLetters(String input) {
        // Convert input to lowercase for case-insensitive comparison
        input = input.toLowerCase();
        // Create a boolean array to keep track of which letters have been found
        boolean[] found = new boolean[26];

        // Loop through each character in the input string
        for (int index = 0; index < input.length(); index++) {
            char c = input.charAt(index);
            // If the character is a letter, mark it as found in the array
            if (c >= 'a' && c <= 'z') {
                found[c - 'a'] = true;
            }
        }

        // Check if all letters have been found
        for (boolean b : found) {
            if (!b) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner userInput  = new Scanner(System.in);
        System.out.print("Enter a string to check that all alphabetical char is present or not?: ");
        // Taking the user input
        String enteredString = userInput.nextLine();
        if(containsAllLetters(enteredString)){
            System.out.println("Valid string");
        }else {
            System.out.println("Not a valid string");
        }
    }
}

