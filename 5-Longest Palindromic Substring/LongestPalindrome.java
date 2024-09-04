class LongestPalindrome {
    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }

        String longest = "";
        for (int i = 0; i < s.length(); i++) {
            // Check for odd-length palindromes
            String oddPalindrome = expandAroundCenter(s, i, i);
            if (oddPalindrome.length() > longest.length()) {
                longest = oddPalindrome;
            }

            // Check for even-length palindromes
            String evenPalindrome = expandAroundCenter(s, i, i + 1);
            if (evenPalindrome.length() > longest.length()) {
                longest = evenPalindrome;
            }
        }

        return longest;
    }

    // Function to expand around the center and find the longest palindrome
    private String expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        // The palindrome is s[left+1:right]
        return s.substring(left + 1, right);
    }

    // Main method to test the function
    public static void main(String[] args) {
        LongestPalindrome solution = new LongestPalindrome();

        String s1 = "babad";
        String s2 = "cbbd";
        String s3 = "a";
        String s4 = "ac";

        System.out.println("Longest palindromic substring of \"" + s1 + "\" is: " + solution.longestPalindrome(s1));
        System.out.println("Longest palindromic substring of \"" + s2 + "\" is: " + solution.longestPalindrome(s2));
        System.out.println("Longest palindromic substring of \"" + s3 + "\" is: " + solution.longestPalindrome(s3));
        System.out.println("Longest palindromic substring of \"" + s4 + "\" is: " + solution.longestPalindrome(s4));
    }
}
