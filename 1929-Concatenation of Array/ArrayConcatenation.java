public class ArrayConcatenation {
    public static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n]; // Create an array of size 2n
        
        // Copy the elements from nums to the first half of ans
        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
        }
        
        // Copy the elements from nums to the second half of ans
        for (int i = 0; i < n; i++) {
            ans[i + n] = nums[i];
        }
        
        return ans;
    }

    public static void main(String[] args) {
        // Example 1
        int[] nums1 = {1, 2, 1};
        int[] result1 = getConcatenation(nums1);
        System.out.println(java.util.Arrays.toString(result1)); // Output: [1, 2, 1, 1, 2, 1]

        // Example 2
        int[] nums2 = {1, 3, 2, 1};
        int[] result2 = getConcatenation(nums2);
        System.out.println(java.util.Arrays.toString(result2)); // Output: [1, 3, 2, 1, 1, 3, 2, 1]
    }
}
