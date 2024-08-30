import java.util.*;

public class MinXorOperations {
    // Method to return the minimum number of operations to make XOR equal to k
    public static int minOperations(int[] nums, int k) {
        int xor = 0;
        for (int num : nums) {
            xor ^= num; // Calculate the XOR of all elements
        }

        int target = xor ^ k; // XOR of current xor and k gives us the target

        int operations = 0;
        while (target > 0) {
            // Count the number of bits that are different (set bits in target)
            target &= (target - 1);
            operations++;
        }
        
        return operations;
    }

    public static void main(String[] args) {
        // Example 1
        int[] nums1 = {2, 1, 3, 4};
        int k1 = 1;
        System.out.println("Example 1 Output: " + minOperations(nums1, k1)); // Output: 2
        
        // Example 2
        int[] nums2 = {2, 0, 2, 0};
        int k2 = 0;
        System.out.println("Example 2 Output: " + minOperations(nums2, k2)); // Output: 0
    }
}
