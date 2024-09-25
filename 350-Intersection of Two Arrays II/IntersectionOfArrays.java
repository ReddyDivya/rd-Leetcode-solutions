import java.util.HashMap;
import java.util.ArrayList;

public class IntersectionOfArrays {
    public static int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> resultList = new ArrayList<>();

        // Count occurrences of each number in nums1
        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Find intersections in nums2
        for (int num : nums2) {
            if (map.containsKey(num) && map.get(num) > 0) {
                resultList.add(num);
                map.put(num, map.get(num) - 1); // Decrease count
            }
        }

        // Convert resultList to an array
        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] intersection = intersect(nums1, nums2);
        System.out.print("Intersection: ");
        for (int num : intersection) {
            System.out.print(num + " ");
        }
        System.out.println();

        int[] nums3 = {4, 9, 5};
        int[] nums4 = {9, 4, 9, 8, 4};
        intersection = intersect(nums3, nums4);
        System.out.print("Intersection: ");
        for (int num : intersection) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
