// File: Reverse.java

public class Reverse {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int num1 = 123;
        int num2 = -123;
        int num3 = 120;
        int num4 = 1534236469; // This will test the overflow condition

        System.out.println("Reverse of " + num1 + " is: " + solution.reverse(num1));
        System.out.println("Reverse of " + num2 + " is: " + solution.reverse(num2));
        System.out.println("Reverse of " + num3 + " is: " + solution.reverse(num3));
        System.out.println("Reverse of " + num4 + " is: " + solution.reverse(num4));
    }
}

class Solution {
    public int reverse(int x) {
        int result = 0;  // Initialize the result to store the reversed number

        // Loop to process each digit of the number
        while (x != 0) {
            int lastDigit = x % 10;  // Get the last digit

            // Check for overflow/underflow before multiplying by 10
            if (result > Integer.MAX_VALUE / 10 || result < Integer.MIN_VALUE / 10) {
                return 0;  // Return 0 in case of overflow/underflow
            }

            result = result * 10 + lastDigit;  // Append the last digit to the result
            x = x / 10;  // Remove the last digit from x
        }

        return result;  // Return the reversed number
    }
}
