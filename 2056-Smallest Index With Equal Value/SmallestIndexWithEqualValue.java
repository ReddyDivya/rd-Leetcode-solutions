// Define the class SmallestIndexWithEqualValue
class SmallestIndexWithEqualValue {

    // Method to find the smallest index i such that i % 10 == nums[i]
    public int smallestEqual(int[] nums) {
        // Iterate through each index i in the array nums
        for (int i = 0; i < nums.length; i++) {
            // Check if the last digit of i (i % 10) is equal to nums[i]
            if (i % 10 == nums[i]) {
                // If condition is met, return the current index i
                return i;
            }
        }
        // If no index satisfies the condition, return -1
        return -1;
    }

    // Main method to test the smallestEqual method
    public static void main(String[] args) {
        SmallestIndexWithEqualValue solution = new SmallestIndexWithEqualValue(); // Create an instance of SmallestIndexWithEqualValue

        // Example 1
        int[] nums1 = {0, 1, 2};
        System.out.println("Example 1: " + solution.smallestEqual(nums1)); // Expected Output: 0

        // Example 2
        int[] nums2 = {4, 3, 2, 1};
        System.out.println("Example 2: " + solution.smallestEqual(nums2)); // Expected Output: 2

        // Example 3
        int[] nums3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        System.out.println("Example 3: " + solution.smallestEqual(nums3)); // Expected Output: -1
    }
} // End of SmallestIndexWithEqualValue class
