class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        // Initialize two pointers, left and right, to the start and end of the array respectively
        int left = 0, right = nums.length - 1;

        // Use binary search to find the target or the correct insertion point
        while (left <= right) {
            // Calculate the middle index to avoid overflow
            int mid = left + (right - left) / 2;

            // Check if the middle element is the target
            if (nums[mid] == target)
                return mid; // Target found, return the index

            // If the target is greater than the middle element, move the left pointer to mid + 1
            else if (nums[mid] < target)
                left = mid + 1;

            // If the target is less than the middle element, move the right pointer to mid - 1
            else
                right = mid - 1;
        }

        // If the target is not found, return the left pointer as the insertion point
        return left;
    }

    public static void main(String[] args) {
        // Create an instance of the SearchInsertPosition class
        SearchInsertPosition solution = new SearchInsertPosition();

        // Test case 1
        int[] nums1 = {1, 3, 5, 6};
        int target1 = 5;
        System.out.println("Output: " + solution.searchInsert(nums1, target1)); // Output: 2

        // Test case 2
        int[] nums2 = {1, 3, 5, 6};
        int target2 = 2;
        System.out.println("Output: " + solution.searchInsert(nums2, target2)); // Output: 1

        // Test case 3
        int[] nums3 = {1, 3, 5, 6};
        int target3 = 7;
        System.out.println("Output: " + solution.searchInsert(nums3, target3)); // Output: 4

        // Test case 4
        int[] nums4 = {1, 3, 5, 6};
        int target4 = 0;
        System.out.println("Output: " + solution.searchInsert(nums4, target4)); // Output: 0
    }
}
