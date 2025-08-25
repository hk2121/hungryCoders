package regexJcaOthers;

public class SplitExample {
    public static void main(String[] args) {
        // Define a string to be split
        String input = "one,two,three,four";

        // Define the regular expression pattern
        String regex = ",";

        // Split the string using the pattern
        String[] result = input.split(regex);

        // Print the result
        for (String part : result) {
            System.out.println(part);
        }
    }
}