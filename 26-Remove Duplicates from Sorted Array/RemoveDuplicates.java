// File: Solution.java

class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0; // If the array is empty, return 0
        
        int k = 1; // Initialize k as the pointer for the position of the next unique element
        for (int i = 1; i < nums.length; i++) {
            
            // Check if the previous element and the current element are not the same
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i]; // Place the current element at the k-th position
                k++; // Increment k to point to the next unique position
            }
        }
        return k; // Return the number of unique elements
    }
}

// File: RemoveDuplicates.java

public class RemoveDuplicates {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int k = solution.removeDuplicates(nums);
        System.out.println("Number of unique elements: " + k);
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
