public class MinimumScoreAfterOperations {

    public static int minScore(int[] nums, int k) {
        // Find the maximum and minimum values in the original array
        int max = nums[0];
        int min = nums[0];
        
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        
        // Calculate the maximum and minimum after applying the operation
        // The operation allows nums[i] to be in the range [nums[i] - k, nums[i] + k]
        int newMax = max - k;
        int newMin = min + k;
        
        // Return the difference between the new max and min
        return Math.max(0, newMax - newMin);
    }

    public static void main(String[] args) {
        // Test cases
        int[] nums1 = {1};
        int k1 = 0;
        System.out.println(minScore(nums1, k1)); // Output: 0
        
        int[] nums2 = {0, 10};
        int k2 = 2;
        System.out.println(minScore(nums2, k2)); // Output: 6
        
        int[] nums3 = {1, 3, 6};
        int k3 = 3;
        System.out.println(minScore(nums3, k3)); // Output: 0
    }
}
