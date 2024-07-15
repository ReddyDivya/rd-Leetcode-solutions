class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        // Initialize pointers for both strings
        int i = 0, j = 0;

        // Iterate through both strings using pointers i and j
        while (i < s.length() && j < t.length()) {
            // Check if characters at current positions match
            if (s.charAt(i) == t.charAt(j)) {
                i++; // Move pointer i to the next character in s
            }

            j++; // Always move pointer j to the next character in t
        }

        // Check if we reached the end of s (i == s.length())
        return i == s.length();
    }

    public static void main(String[] args) {
        // Create an instance of the Solution class
        IsSubsequence solution = new IsSubsequence();
        
        // Example input strings
        String s = "abc";   // Subsequence string
        String t = "ahbgdc"; // Target string
        
        // Call the method and print the result
        boolean result = solution.isSubsequence(s, t);
        System.out.println("Is '" + s + "' a subsequence of '" + t + "'? " + result);
    }
}
