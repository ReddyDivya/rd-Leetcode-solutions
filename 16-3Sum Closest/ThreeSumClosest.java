import java.util.Arrays;

public class ThreeSumClosest {

    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums); // Sort the array
        int closestSum = nums[0] + nums[1] + nums[2]; // Initialize closest sum
        
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1, right = nums.length - 1;
            
            while (left < right) {
                int currentSum = nums[i] + nums[left] + nums[right];
                
                // Check if current sum is closer to target than the previous closest sum
                if (Math.abs(currentSum - target) < Math.abs(closestSum - target)) {
                    closestSum = currentSum;
                }
                
                // Move pointers based on comparison with target
                if (currentSum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        
        return closestSum;
    }

    public static void main(String[] args) {
        int[] nums1 = {-1, 2, 1, -4};
        int target1 = 1;
        System.out.println("Closest sum: " + threeSumClosest(nums1, target1)); // Output: 2

        int[] nums2 = {0, 0, 0};
        int target2 = 1;
        System.out.println("Closest sum: " + threeSumClosest(nums2, target2)); // Output: 0
    }
}
