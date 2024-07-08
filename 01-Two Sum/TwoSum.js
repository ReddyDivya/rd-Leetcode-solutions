import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int[] twoSum(int[] arr, int target) {
        int n = arr.length; // Length of the array
        
        // Create an array of pairs to store elements and their original indices
        int[][] numsWithIndex = new int[n][2];
        for (int i = 0; i < n; i++) {
            numsWithIndex[i][0] = arr[i]; // Store the element
            numsWithIndex[i][1] = i; // Store the original index
        }

        // Sort the array based on the elements
        Arrays.sort(numsWithIndex, Comparator.comparingInt(a -> a[0]));

        // Initialize two pointers
        int left = 0, right = n - 1;
        int[] ans = new int[2];
        ans[0] = ans[1] = -1; // Default values

        // Use two pointers to find the target sum
        while (left < right) { // Left pointer shouldn't exceed the right pointer
            int sum = numsWithIndex[left][0] + numsWithIndex[right][0]; // Calculate the sum of elements at the pointers
            if (sum == target) { // If the sum matches the target
                ans[0] = numsWithIndex[left][1]; // Store the original index of the left element
                ans[1] = numsWithIndex[right][1]; // Store the original index of the right element
                return ans; // Return the indices
            } else if (sum < target) { // If sum is less than target, increment the left pointer
                left++;
            } else { // If sum is greater than target, decrement the right pointer
                right--;
            }
        }

        return ans; // Return default values if no solution is found
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = { 2, 7, 11, 15 };
        int target = 9;
        int[] result = solution.twoSum(arr, target);
        System.out.println("Indices of the two numbers that add up to target:");
        System.out.println(Arrays.toString(result));
    }
}
