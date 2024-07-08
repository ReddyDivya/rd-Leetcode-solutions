class Solution {
    public boolean isPalindrome(String s) {
        // Convert the string to lowercase and remove non-alphanumeric characters
        String cleanString = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        
        // Two pointers approach to check if cleanString is a palindrome
        int left = 0; // Initialize left pointer at the beginning of the string
        int right = cleanString.length() - 1; // Initialize right pointer at the end of the string
        
        while (left < right) {
            if (cleanString.charAt(left) != cleanString.charAt(right)) {
                return false; // Characters don't match, not a palindrome
            }
            left++; // Move left pointer to the right
            right--; // Move right pointer to the left
        }
        
        return true; // If all characters match, it's a palindrome
    }
    
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test cases
        String s1 = "A man, a plan, a canal: Panama";
        String s2 = "race a car";
        
        System.out.println("Is '" + s1 + "' a palindrome? " + solution.isPalindrome(s1));
        System.out.println("Is '" + s2 + "' a palindrome? " + solution.isPalindrome(s2));
    }
}
