/*
Problem Statement: I/O
    Using TextFile and a Map<Character,Integer>, create a program that takes the file name as a command line argument
    and counts the occurrence of all the different characters. Save the results in a text file.

    To run this program:
        Go to terminal
        Go to assignment11 folder
        To compile: javac FileCharacterCounter.java
        To run : java FileCharacterCounter.java  file.txt
 */


package assignment11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class FileCharacterCounter {

    // FileReader method Complexity: Time: O(n), Space: O(m), Where n= no of char in input file m = no of unique char in input file
    public static void fileReader(String fileName) {
        Map<Character, Integer> charCounts = new TreeMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            int c;
            while ((c = reader.read()) != -1) {
                char ch = (char) c;
                if (!charCounts.containsKey(ch)) {
                    charCounts.put(ch, 1);
                } else {
                    int count = charCounts.get(ch);
                    charCounts.put(ch, count + 1);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }
        // Invoking the fileWriter method to write in the provided file name.
        fileWriter(charCounts, "frequency.txt");
    }


    // fileWriter method Complexity: Time: O(n*logn), Space: O(1), Where n = No of distinct char in the Map
    public static void fileWriter(Map<Character, Integer> charCounts, String frequencyFile) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(frequencyFile))) {
            for (Map.Entry<Character, Integer> entry : charCounts.entrySet()) {
                char ch = entry.getKey();
                int count = entry.getValue();
                writer.write(String.format("%c: %d\n", ch, count));
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: java FileCharacterCounter <filename>");
            System.exit(1);
        }

        String filename = args[0];
        fileReader(filename);
    }
}