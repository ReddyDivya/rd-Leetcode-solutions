import java.util.HashSet;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        // Create a HashSet to store the elements of the array
        HashSet<Integer> hSet = new HashSet<Integer>();

        // Iterate through each element in the array
        for (int num : nums) {
            // Check if the current element is already in the HashSet
            if (hSet.contains(num)) {
                // If it is, return true since a duplicate is found
                return true;
            }

            // If it is not in the HashSet, add the element to the HashSet
            hSet.add(num);
        }

        // If no duplicates are found after checking all elements, return false
        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicate solution = new ContainsDuplicate();

        int[] nums1 = {1, 2, 3, 1};
        System.out.println(solution.containsDuplicate(nums1)); // Output: true

        int[] nums2 = {1, 2, 3, 4};
        System.out.println(solution.containsDuplicate(nums2)); // Output: false

        int[] nums3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println(solution.containsDuplicate(nums3)); // Output: true
    }
}
