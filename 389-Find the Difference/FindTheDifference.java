class FindTheDifference {
    public char findTheDifference(String s, String t) {
        // Initialize variables to store the sum of ASCII values of characters in strings s and t
        int sumS = 0, sumT = 0;
        
        // Example input s = "abcd"
        // Loop through each character in string s
        for (int i = 0; i < s.length(); i++) {
            // Add the ASCII value of the current character in s to sumS
            sumS += s.charAt(i);
            // For s = "abcd", this will be:
            // i = 0, s.charAt(i) = 'a', sumS = 97
            // i = 1, s.charAt(i) = 'b', sumS = 97 + 98 = 195
            // i = 2, s.charAt(i) = 'c', sumS = 195 + 99 = 294
            // i = 3, s.charAt(i) = 'd', sumS = 294 + 100 = 394
        }
        
        // Example input t = "abcde"
        // Loop through each character in string t
        for (int i = 0; i < t.length(); i++) {
            // Add the ASCII value of the current character in t to sumT
            sumT += t.charAt(i);
            // For t = "abcde", this will be:
            // i = 0, t.charAt(i) = 'a', sumT = 97
            // i = 1, t.charAt(i) = 'b', sumT = 97 + 98 = 195
            // i = 2, t.charAt(i) = 'c', sumT = 195 + 99 = 294
            // i = 3, t.charAt(i) = 'd', sumT = 294 + 100 = 394
            // i = 4, t.charAt(i) = 'e', sumT = 394 + 101 = 495
        }
        
        // Calculate the difference between the sum of ASCII values in t and s
        // This difference will be the ASCII value of the extra character in t
        // For s = "abcd" and t = "abcde", sumT - sumS = 495 - 394 = 101, which is the ASCII value of 'e'
        return (char) (sumT - sumS);  // Returns 'e'
    }

    // Main method to test the findTheDifference method
    public static void main(String[] args) {
        FindTheDifference solution = new FindTheDifference();
        
        // Test case
        String s = "abcd";
        String t = "abcde";
        
        // Call the findTheDifference method and print the result
        char result = solution.findTheDifference(s, t);
        System.out.println("The extra character is: " + result); // Output: The extra character is: e
    }
}
