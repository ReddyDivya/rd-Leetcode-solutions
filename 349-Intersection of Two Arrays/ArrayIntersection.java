import java.util.*;

public class ArrayIntersection {
    public static int[] intersection(int[] nums1, int[] nums2) {
        // Use a set to store unique elements from nums1
        Set<Integer> set1 = new HashSet<>();
        for (int num : nums1) {
            set1.add(num);
        }
        
        // Use another set to store the intersection
        Set<Integer> intersectionSet = new HashSet<>();
        for (int num : nums2) {
            if (set1.contains(num)) {
                intersectionSet.add(num);  // Add only if it's present in nums1
            }
        }
        
        // Convert the intersection set to an array
        int[] result = new int[intersectionSet.size()];
        int index = 0;
        for (int num : intersectionSet) {
            result[index++] = num;
        }
        
        return result;
    }

    public static void main(String[] args) {
        // Example 1
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        System.out.println("Example 1: " + Arrays.toString(intersection(nums1, nums2)));

        // Example 2
        int[] nums3 = {4, 9, 5};
        int[] nums4 = {9, 4, 9, 8, 4};
        System.out.println("Example 2: " + Arrays.toString(intersection(nums3, nums4)));
    }
}
