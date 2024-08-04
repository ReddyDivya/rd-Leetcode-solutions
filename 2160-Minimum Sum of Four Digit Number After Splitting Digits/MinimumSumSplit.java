import java.util.Arrays;

public class MinimumSumSplit {

    public static int minimumSum(int num) {
        // Convert the number to a char array of digits
        char[] digits = Integer.toString(num).toCharArray();
        
        // Sort the digits array
        Arrays.sort(digits);
        
        // Form two new numbers from the sorted digits
        int new1 = (digits[0] - '0') * 10 + (digits[2] - '0');
        int new2 = (digits[1] - '0') * 10 + (digits[3] - '0');
        
        // Return the sum of the two new numbers
        return new1 + new2;
    }

    public static void main(String[] args) {
        // Example 1
        int num1 = 2932;
        System.out.println("Input: num = " + num1);
        System.out.println("Output: " + minimumSum(num1)); // Output: 52
        
        // Example 2
        int num2 = 4009;
        System.out.println("Input: num = " + num2);
        System.out.println("Output: " + minimumSum(num2)); // Output: 13
    }
}
