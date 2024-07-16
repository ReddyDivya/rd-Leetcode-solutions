import java.util.HashSet;

public class LongestPalindrome {
    
    public int longestPalindrome(String s) {
        // If the input string is null or its length is 0, return 0
        if (s == null || s.length() == 0) {
            return 0;
        }

        // A HashSet to keep track of characters that haven't formed pairs yet
        HashSet<Character> charSet = new HashSet<>();
        
        // A variable to count the length of the longest palindrome
        int count = 0;

        // Iterate through each character in the string
        for (char ch : s.toCharArray()) {
            // If the character is already in the set, it means we have found a pair
            if (charSet.contains(ch)) {
                // Remove the character from the set as it forms a pair
                charSet.remove(ch);
                // Increment the count by 2 as each pair contributes 2 to the length of the palindrome
                count += 2;
            } else {
                // If the character is not in the set, add it to the set
                charSet.add(ch);
            }
        }

        // If the set is not empty, it means we have characters left that didn't form pairs
        // We can use one of these characters as the center of the palindrome, so increment count by 1
        return charSet.isEmpty() ? count : count + 1;
    }

    public static void main(String[] args) {
        LongestPalindrome lp = new LongestPalindrome();
        
        // Test case 1: Input string is "abccccdd"
        // Explanation: One longest palindrome that can be built is "dccaccd", whose length is 7
        System.out.println(lp.longestPalindrome("abccccdd")); // Output: 7
        
        // Test case 2: Input string is "a"
        // Explanation: The longest palindrome that can be built is "a", whose length is 1
        System.out.println(lp.longestPalindrome("a")); // Output: 1
        
        // Test case 3: Input string is "bb"
        // Explanation: The longest palindrome that can be built is "bb", whose length is 2
        System.out.println(lp.longestPalindrome("bb")); // Output: 2
    }
}
