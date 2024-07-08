class Solution {
    public boolean isPalindrome(int x) {
        // Negative numbers are not palindromes
        if (x < 0) {
            return false;
        }

        int result = 0;  // Initialize the variable to store the reversed number
        int n = x;  // Make a copy of the original number

        // Loop to reverse the number
        while (n > 0) {
            int lastDigit = n % 10;  // Get the last digit

            // Check for overflow/underflow
            if (result > (Integer.MAX_VALUE - lastDigit) / 10) {
                return false;  // Return false in case of overflow
            }

            result = result * 10 + lastDigit;  // Append the last digit to the result
            n = n / 10;  // Remove the last digit from n
        }

        // Check if the original number is equal to the reversed number
        return x == result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases
        int num1 = 121;
        int num2 = -121;
        int num3 = 10;

        // Check if each number is a palindrome
        System.out.println(num1 + " is palindrome: " + solution.isPalindrome(num1));
        System.out.println(num2 + " is palindrome: " + solution.isPalindrome(num2));
        System.out.println(num3 + " is palindrome: " + solution.isPalindrome(num3));
    }
}
