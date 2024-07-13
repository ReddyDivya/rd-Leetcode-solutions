public class MajorityElement {
    public int majorityElement(int[] nums) {
        // Optimal approach - Boyer-Moore's Voting Algorithm
        int count = 0;
        int element = 0;

        // Find potential majority element using Boyer-Moore Voting Algorithm
        for (int num : nums) {
            if (count == 0) {
                element = num; // Initialize element
                count = 1;
            } else if (element == num) {
                count++;
            } else {
                count--;
            }
        }

        // Count occurrences of the potential majority element
        int count1 = 0;
        for (int num : nums) {
            if (num == element) {
                count1++;
            }
        }

        // Check if the element found is the majority element
        if (count1 > (nums.length / 2)) {
            return element;
        }

        return -1; // Return -1 if no majority element found
    }

    public static void main(String[] args) {
        MajorityElement solution = new MajorityElement();

        // Example 1
        int[] nums1 = {3, 2, 3};
        int result1 = solution.majorityElement(nums1);
        System.out.println("Example 1 - The majority element is: " + result1);

        // Example 2
        int[] nums2 = {2, 2, 1, 1, 1, 2, 2};
        int result2 = solution.majorityElement(nums2);
        System.out.println("Example 2 - The majority element is: " + result2);
    }
}
