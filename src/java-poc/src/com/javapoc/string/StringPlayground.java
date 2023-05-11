/*
String is a sequence of characters. But in Java, string is an object that represents a sequence of characters.
 The java.lang.String class is used to create a string object.
 */

package com.javapoc.string;

public class StringPlayground {
    public static void main(String[] args) {
        String greet = "Welcome"; // String literal
        String greet2 = "Welcome"; //It doesn't create a new instance
        char ch[] = {'s', 't', 'r', 'i', 'n', 'g', 's'};
        String s2 = new String(ch);//converting char basics.array to string
        String s3 = new String("example");//creating Java string by new keyword
        System.out.println(greet + ch + s2 + s3);

//        Various method
        int length = greet.length();
        char letter = greet.charAt(2); // l
        System.out.println(greet + letter + letter);

        String subStr = greet.substring(1, 5);
        System.out.println(greet + subStr); // Welcome elco

        String fName = "Raushan";
        String lName = " Gupta";
        String fullName = fName.concat(lName);
        System.out.println("Concated String: " + fullName);

        String quote = "Learn Share Learn";
        int idx = quote.indexOf("Share");


    }
}
