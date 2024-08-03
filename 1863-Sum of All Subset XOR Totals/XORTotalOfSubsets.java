public class XORTotalOfSubsets {
    public static void main(String[] args) {
        int[] nums1 = {1, 3};
        int[] nums2 = {5, 1, 6};
        
        System.out.println("The sum of all XOR totals for subsets of {1, 3} is: " + subsetXORSum(nums1));
        System.out.println("The sum of all XOR totals for subsets of {5, 1, 6} is: " + subsetXORSum(nums2));
    }

    public static int subsetXORSum(int[] nums) {
        return subsetXORSumHelper(nums, 0, 0);
    }

    private static int subsetXORSumHelper(int[] nums, int index, int currentXOR) {
        if (index == nums.length) {
            return currentXOR;
        }
        // Calculate the XOR sum by including the current element
        int withCurrent = subsetXORSumHelper(nums, index + 1, currentXOR ^ nums[index]);
        // Calculate the XOR sum by excluding the current element
        int withoutCurrent = subsetXORSumHelper(nums, index + 1, currentXOR);
        
        // Return the total sum
        return withCurrent + withoutCurrent;
    }
}
