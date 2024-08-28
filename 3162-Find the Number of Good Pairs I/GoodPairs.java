public class GoodPairs {
    public static int countGoodPairs(int[] nums1, int[] nums2, int k) {
        int count = 0;
        
        // Iterate over both arrays to check all pairs (i, j)
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                // Check if nums1[i] is divisible by nums2[j] * k
                if (nums1[i] % (nums2[j] * k) == 0) {
                    count++; // Increment the count if it's a good pair
                }
            }
        }
        
        return count; // Return the total number of good pairs
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 3, 4};
        int[] nums2 = {1, 3, 4};
        int k = 1;
        System.out.println("Total good pairs: " + countGoodPairs(nums1, nums2, k)); // Output: 5

        int[] nums1_2 = {1, 2, 4, 12};
        int[] nums2_2 = {2, 4};
        int k2 = 3;
        System.out.println("Total good pairs: " + countGoodPairs(nums1_2, nums2_2, k2)); // Output: 2
    }
}
