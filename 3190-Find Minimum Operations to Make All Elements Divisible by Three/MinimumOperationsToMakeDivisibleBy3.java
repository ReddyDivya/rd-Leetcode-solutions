import java.util.*;

public class MinimumOperationsToMakeDivisibleBy3 {
    public static int minOperations(int[] nums) {
        int operations = 0;

        for (int num : nums) {
            int remainder = num % 3;
            if (remainder != 0) {
                operations += Math.min(remainder, 3 - remainder);
            }
        }

        return operations;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4};
        int[] nums2 = {3, 6, 9};

        System.out.println("Example 1:");
        System.out.println("Input: nums = " + Arrays.toString(nums1));
        System.out.println("Output: " + minOperations(nums1));
        System.out.println("Explanation: \nSubtract 1 from 1. \nAdd 1 to 2. \nSubtract 1 from 4.");
        
        System.out.println("\nExample 2:");
        System.out.println("Input: nums = " + Arrays.toString(nums2));
        System.out.println("Output: " + minOperations(nums2));
    }
}
