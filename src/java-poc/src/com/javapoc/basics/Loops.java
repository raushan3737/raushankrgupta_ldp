/*
Loops: A tool to do the repetition of the same task  iterate over the collection
 */
package com.javapoc.basics;

public class Loops {
    public static void main(String[] args) {
        // While Loops
        int number = 23;
        while (number < 34) {
            System.out.println("Okay " + number);
            number += 2;
        }

        //  For loops
        for (int i = 0; i < 5; i++) {
            System.out.println("Index: " + i);
        }

    }
}
