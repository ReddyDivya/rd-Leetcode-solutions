public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        // Trim the input string to remove leading and trailing whitespace
        s = s.trim();
        
        // Initialize a variable to store the length of the last word
        int lenOfLastWord = 0;

        // Iterate backwards through the string to find the last word
        for (int i = s.length() - 1; i >= 0; i--) {
            // Break when we encounter the first whitespace from the end
            if (s.charAt(i) == ' ') {
                break;
            }
            // Increment the length for each character of the last word
            lenOfLastWord++;
        }

        // Return the length of the last word found in the trimmed string
        return lenOfLastWord;
    }

    public static void main(String[] args) {
        // Test cases
        String s1 = "Hello World";
        String s2 = "  How are you?   ";
        String s3 = "a "; // Edge case with a single character and trailing space
        String s4 = ""; // Edge case with an empty string

        // Create an instance of Solution
        LengthOfLastWord solution = new LengthOfLastWord();

        // Compute and print the length of the last word for each test case
        System.out.println("Length of the last word in '" + s1 + "': " + solution.lengthOfLastWord(s1));
        System.out.println("Length of the last word in '" + s2 + "': " + solution.lengthOfLastWord(s2));
        System.out.println("Length of the last word in '" + s3 + "': " + solution.lengthOfLastWord(s3));
        System.out.println("Length of the last word in '" + s4 + "': " + solution.lengthOfLastWord(s4));
    }
}
