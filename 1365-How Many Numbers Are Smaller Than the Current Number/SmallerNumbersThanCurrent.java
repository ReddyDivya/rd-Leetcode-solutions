import java.util.Arrays;

public class SmallerNumbersThanCurrent {
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];
        
        // Loop through each number in the array
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            
            // Count how many numbers are smaller than nums[i]
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] < nums[i]) {
                    count++;
                }
            }
            
            result[i] = count;
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        int[] nums1 = {8, 1, 2, 2, 3};
        int[] nums2 = {6, 5, 4, 8};
        int[] nums3 = {7, 7, 7, 7};

        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums1))); // Output: [4, 0, 1, 1, 3]
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums2))); // Output: [2, 1, 0, 3]
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums3))); // Output: [0, 0, 0, 0]
    }
}
