public class StringScore {
    // Method to calculate the score of a string
    public static int calculateScore(String s) {
        // Initialize the score variable to 0
        int score = 0;
        
        // Loop through the string starting from the second character
        for (int i = 1; i < s.length(); i++) {
            // Add the absolute difference between the ASCII values of adjacent characters to the score
            score += Math.abs(s.charAt(i) - s.charAt(i - 1));
        }

        // Return the final calculated score
        return score;
    }

    public static void main(String[] args) {
        // Test case 1
        String s1 = "hello";
        // Print the score of the first test case
        System.out.println("Score of \"" + s1 + "\": " + calculateScore(s1));  // Output: 13

        // Test case 2
        String s2 = "zaz";
        // Print the score of the second test case
        System.out.println("Score of \"" + s2 + "\": " + calculateScore(s2));  // Output: 50
    }
}
