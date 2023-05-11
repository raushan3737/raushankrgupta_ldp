package com.javapoc.basics;


import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        // Switch Statements
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter your instructions: ");
        String command = ip.nextLine();
        switch (command) {
            case "run":
                System.out.println("Program is running...");
                break;
            case "stop":
                System.out.println("Program is stopped...");
                break;
            default:
                System.out.println("Instructions not recognized");
        }
    }
}
