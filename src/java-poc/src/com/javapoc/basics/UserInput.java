package com.javapoc.basics;


import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        // Getting User Input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a text line: ");
        String text1 = input.nextLine();
        System.out.println("Your line is: " + text1);


        System.out.print("Enter a Integer: ");
        int value = input.nextInt();
        System.out.println("Your number is: " + value);

        System.out.print("Enter a Decimal Number: ");
        double num = input.nextDouble();
        System.out.println("Your number is: " + num);
    }
}
