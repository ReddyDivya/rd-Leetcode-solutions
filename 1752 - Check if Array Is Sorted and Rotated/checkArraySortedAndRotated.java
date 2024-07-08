class Solution {
    /**
     * This method checks if the given array is a rotated version of a non-decreasing sorted array.
     * @param nums the input array to check
     * @return true if the array is a rotated sorted array, otherwise false
     */
    public boolean check(int[] nums) {
        int count = 0; // Initialize a counter to track the number of breaks in the sorted order
        int n = nums.length; // Get the length of the array

        // Loop through the array to check for breaks in the sorted order
        for (int i = 0; i < n; i++) {
            // Compare the current element with the next element in a circular manner
            if (nums[i] > nums[(i + 1) % n]) {
                count++; // Increment the count if there is a break in the sorted order
            }

            // If there is more than one break, the array cannot be a rotated sorted array
            if (count > 1) {
                return false; // Return false immediately if more than one break is found
            }
        }

        // If the loop completes and there is at most one break, return true
        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases
        int[] arr1 = {3, 4, 5, 1, 2}; // Rotated sorted array
        int[] arr2 = {2, 1, 3, 4};    // Not a rotated sorted array

        // Check if each array is a rotated sorted array
        System.out.println("arr1 is rotated sorted array: " + solution.check(arr1));
        System.out.println("arr2 is rotated sorted array: " + solution.check(arr2));
    }
}
