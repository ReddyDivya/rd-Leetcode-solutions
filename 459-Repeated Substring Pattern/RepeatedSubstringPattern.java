class RepeatedSubstringPattern {
    public boolean repeatedSubstringPattern(String s) {
        // Get the length of the input string
        int n = s.length();

        // Loop through possible substring lengths from 1 to n/2
        for (int i = 1; i <= n / 2; i++) {
            // Check if the length of the string is a multiple of the current length
            if (n % i == 0) {
                // Get the substring of length i
                String sub = s.substring(0, i); // Extract substring from 0 to i
                
                // Create a new StringBuilder to construct the repeated string
                StringBuilder str = new StringBuilder();
                
                // Append the substring to the StringBuilder n/i times
                for (int j = 0; j < n / i; j++) {
                    str.append(sub);
                }

                // Check if the constructed string equals the original string
                if (str.toString().equals(s)) {
                    return true; // Return true if match is found
                }
            }
        }
        
        // Return false if no match is found
        return false;
    }
    
    public static void main(String[] args) {
        RepeatedSubstringPattern solution = new RepeatedSubstringPattern();
        
        // Example 1
        String s1 = "abab";
        System.out.println("Input: " + s1 + ", Output: " + solution.repeatedSubstringPattern(s1)); // true
        
        // Example 2
        String s2 = "aba";
        System.out.println("Input: " + s2 + ", Output: " + solution.repeatedSubstringPattern(s2)); // false
        
        // Example 3
        String s3 = "abcabcabcabc";
        System.out.println("Input: " + s3 + ", Output: " + solution.repeatedSubstringPattern(s3)); // true
    }
}
