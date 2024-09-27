public class MissingNumber {
    public static int findMissingNumber(int[] nums) {
        int n = nums.length;
        // Calculate the sum of numbers from 0 to n
        int totalSum = n * (n + 1) / 2;

        // Calculate the sum of the numbers in the given array
        int arraySum = 0;
        for (int num : nums) {
            arraySum += num;
        }

        // The missing number is the difference between totalSum and arraySum
        return totalSum - arraySum;
    }

    public static void main(String[] args) {
        // Example 1
        int[] nums1 = {3, 0, 1};
        System.out.println("Missing number: " + findMissingNumber(nums1)); // Output: 2

        // Example 2
        int[] nums2 = {0, 1};
        System.out.println("Missing number: " + findMissingNumber(nums2)); // Output: 2

        // Example 3
        int[] nums3 = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        System.out.println("Missing number: " + findMissingNumber(nums3)); // Output: 8
    }
}
