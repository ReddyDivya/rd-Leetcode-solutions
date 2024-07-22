public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int lastNonZeroFoundAt = 0; // Index of the last found non-zero element

        // Iterate through the array. When we encounter a non-zero element, we swap it with the element at lastNonZeroFoundAt index.
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                // Swap the elements
                int temp = nums[lastNonZeroFoundAt];
                nums[lastNonZeroFoundAt] = nums[i];
                nums[i] = temp;
                lastNonZeroFoundAt++;
            }
        }
    }

    public static void main(String[] args) {
        MoveZeroes solution = new MoveZeroes();

        // Test case 1
        int[] nums1 = {0, 1, 0, 3, 12};
        solution.moveZeroes(nums1);
        System.out.println(java.util.Arrays.toString(nums1)); // Output: [1, 3, 12, 0, 0]

        // Test case 2
        int[] nums2 = {0};
        solution.moveZeroes(nums2);
        System.out.println(java.util.Arrays.toString(nums2)); // Output: [0]
    }
}
