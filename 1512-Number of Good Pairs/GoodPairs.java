import java.util.HashMap;
import java.util.Map;

public class GoodPairs {

    public static int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();
        int goodPairs = 0;

        for (int num : nums) {
            if (countMap.containsKey(num)) {
                goodPairs += countMap.get(num);
            }
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        return goodPairs;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 1, 1, 3};
        int[] nums2 = {1, 1, 1, 1};
        int[] nums3 = {1, 2, 3};

        System.out.println("Example 1: " + numIdenticalPairs(nums1)); // Output: 4
        System.out.println("Example 2: " + numIdenticalPairs(nums2)); // Output: 6
        System.out.println("Example 3: " + numIdenticalPairs(nums3)); // Output: 0
    }
}
