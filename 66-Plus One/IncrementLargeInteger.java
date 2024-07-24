import java.util.Arrays;

public class IncrementLargeInteger {
    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        
        // Traverse the array from the end to the beginning
        for (int i = n - 1; i >= 0; i--) {
            // If the current digit is less than 9, simply increment it and return the result
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            // If the current digit is 9, set it to 0
            digits[i] = 0;
        }
        
        // If all digits were 9, we need to add a leading 1
        int[] newDigits = new int[n + 1];
        newDigits[0] = 1;
        return newDigits;
    }

    public static void main(String[] args) {
        int[] digits1 = {1, 2, 3};
        int[] digits2 = {4, 3, 2, 1};
        int[] digits3 = {9};
        
        System.out.println(Arrays.toString(plusOne(digits1))); // Output: [1, 2, 4]
        System.out.println(Arrays.toString(plusOne(digits2))); // Output: [4, 3, 2, 2]
        System.out.println(Arrays.toString(plusOne(digits3))); // Output: [1, 0]
    }
}
