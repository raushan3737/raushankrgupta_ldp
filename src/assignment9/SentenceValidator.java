/*
Problem Statement: Using the documentation for java.util.regex.Pattern as a resource
write and test a regular expression that checks a sentence to see that it begins with a capital letter and ends with a period.
 */
package assignment9;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SentenceValidator {
    private static void validateSentence(String sentence, Pattern pattern) {
        Matcher matcher = pattern.matcher(sentence);
        if (matcher.matches()) {
            System.out.println(sentence + " is a valid sentence.");
        } else {
            System.out.println(sentence + " is an invalid sentence.");
        }
    }
    public static void main(String[] args) {
        Scanner userInput  = new Scanner(System.in);
        System.out.print("Enter a string to check whether the string is starting with the uppercase char & end with period: ");
        // Taking the user input
        String enteredString = userInput.nextLine();
        Pattern pattern = Pattern.compile("^[A-Z].*\\.$");
        validateSentence(enteredString, pattern);

    }
}
