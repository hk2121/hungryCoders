package regexJcaOthers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexCompileExample {
    public static void main(String[] args) {
        // Step 1: Define the regular expression pattern as a string
        String regex = "\\bcat\\b";// This pattern matches the word "cat" as a whole word

        // Step 2: Compile the regular expression pattern
        Pattern pattern = Pattern.compile(regex);

        // Step 3: Create an input string to search
        String input = "The cat sat on the mat.";

        // Step 4: Create a Matcher object from the input string
        Matcher matcher = pattern.matcher(input);

        // Step 5: Perform matching operations using the Matcher object
        boolean found = matcher.find();

        if (found) {
            System.out.println("Match found!");
        } else {
            System.out.println("No match found.");
        }

        // Step 6: Print all matches
        matcher.reset(); // Reset matcher to start from the beginning
        while (matcher.find()) {
            System.out.println("Match: " + matcher.group());
        }
    }
}