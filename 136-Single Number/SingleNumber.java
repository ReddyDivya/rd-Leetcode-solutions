class SingleNumber {
    public int singleNumber(int[] nums) {
        int result = 0;
        
        // XOR all elements in the array
        for (int num : nums) {
            /*
                nums = [2,2,1]
                2= 0^2
                0= 2^2
                1= 0^1
            */
            result ^= num;
        }
        
        // The result will be the single number
        return result;
    }

    public static void main(String[] args) {
        // Create an instance of the Solution class
        SingleNumber solution = new SingleNumber();

        // Test case 1
        int[] nums1 = {2, 2, 1};
        System.out.println("Output: " + solution.singleNumber(nums1)); // Output: 1

        // Test case 2
        int[] nums2 = {4, 1, 2, 1, 2};
        System.out.println("Output: " + solution.singleNumber(nums2)); // Output: 4

        // Test case 3
        int[] nums3 = {1};
        System.out.println("Output: " + solution.singleNumber(nums3)); // Output: 1
    }
}
