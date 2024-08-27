import java.util.*;

public class Minimal2DArray {
    public static List<List<Integer>> findMinimal2DArray(int[] nums) {
        // Create a map to store the occurrences of each element in nums
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Find the maximum occurrence of any element in the nums array
        int maxFrequency = Collections.max(freqMap.values());

        // Create a list of lists to store the resulting 2D array
        List<List<Integer>> result = new ArrayList<>();

        // Initialize rows in the result 2D array based on the maximum frequency
        for (int i = 0; i < maxFrequency; i++) {
            result.add(new ArrayList<>());
        }

        // Distribute the elements of nums into the rows
        for (int num : nums) {
            for (List<Integer> row : result) {
                // Add the element to the first row where it's not present
                if (!row.contains(num)) {
                    row.add(num);
                    break;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        // Example 1
        int[] nums1 = {1, 3, 4, 1, 2, 3, 1};
        System.out.println("Example 1: " + findMinimal2DArray(nums1));

        // Example 2
        int[] nums2 = {1, 2, 3, 4};
        System.out.println("Example 2: " + findMinimal2DArray(nums2));
    }
}
