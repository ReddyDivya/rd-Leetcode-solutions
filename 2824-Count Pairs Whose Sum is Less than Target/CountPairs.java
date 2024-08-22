import java.util.Arrays;
import java.util.List;

class CountPairs {
    public int countPairs(List<Integer> nums, int target) {
        int count = 0;
        int n = nums.size(); // Use size() for List

        // Loop through all possible pairs
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums.get(i) + nums.get(j) < target) { // Use get(index) to access List elements
                    count++;
                }
            }
        }

        return count;
    }
}

public class Main {
    public static void main(String[] args) {
        CountPairs solution = new CountPairs();

        // Test case 1
        List<Integer> nums1 = Arrays.asList(-1, 1, 2, 3, 1);
        int target1 = 2;
        System.out.println("Output for test case 1: " + solution.countPairs(nums1, target1)); // Output: 3

        // Test case 2
        List<Integer> nums2 = Arrays.asList(-6, 2, 5, -2, -7, -1, 3);
        int target2 = -2;
        System.out.println("Output for test case 2: " + solution.countPairs(nums2, target2)); // Output: 10
    }
}
