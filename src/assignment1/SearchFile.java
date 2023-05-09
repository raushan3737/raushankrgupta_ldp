/*
    Problem Statement: Create a java program to search through the home directory and look for files that match a regular expression.
    The program should be able to take inputs repeatedly and should print out the full absolute path of the matching files found.

     Test case:
     Enter a Regular expression to search: .*\.xml
     Files Absolute Path is C:\Users\Raushan Kumar Gupta\Desktop\zemoso\java-playground\java-assignments\.idea\misc.xml
     Files Absolute Path is C:\Users\Raushan Kumar Gupta\Desktop\zemoso\java-playground\java-assignments\.idea\modules.xml

     Enter a Regular expression to search: Main.java
    Files Absolute Path is C:\Users\Raushan Kumar Gupta\Desktop\zemoso\java-playground\java-assignments\src\Main.java

 */


package assignment1;

import java.io.File;
import java.util.Scanner;

public class SearchFile {
    // Method to search file to the given path
    // Complexity: Time: O(d * f), Space: O(d*f),  Where, d= no of directory , f = no of files.
    public static void getFileNames(String pattern, File dir) {
        if (dir.isDirectory()) {
            // Creating a file array to iterate
            File[] files = dir.listFiles();
            assert files != null;
            for (File file : files) {
                if (file.isDirectory()) {
                    getFileNames(pattern, file);
                } else {
                    if (file.getName().matches(pattern)) {
                        System.out.println("Files Absolute Path is " + file.getAbsolutePath());
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        File dir = new File("C:\\Users\\Raushan Kumar Gupta\\Desktop\\zemoso\\java-playground\\java-assignments");

        do {
            System.out.print("Enter a Regular expression to search: ");
            String pattern = sc.next();
            if (pattern.equals("STOP")) {
                break;
            } else {
                getFileNames(pattern, dir);
            }
        } while (true);
    }
}
