import java.util.List;

class SumIndicesWithKSetBits {

    // Helper method to count the number of set bits (1's) in the binary representation of a number
    private int countSetBits(int num) {
        int count = 0;
        while (num > 0) {
            count += (num & 1); // Add 1 if the least significant bit is 1
            num >>= 1; // Shift the number to the right by 1 bit
        }
        return count;
    }

    // Method to calculate the sum of elements in nums whose corresponding indices have exactly k set bits
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (countSetBits(i) == k) { // Check if the index has exactly k set bits
                sum += nums.get(i); // Add the element at the index to the sum
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        SumIndicesWithKSetBits solution = new SumIndicesWithKSetBits();
        
        // Example 1
        List<Integer> nums1 = List.of(5, 10, 1, 5, 2);
        int k1 = 1;
        System.out.println("Output 1: " + solution.sumIndicesWithKSetBits(nums1, k1)); // Expected output: 13
        
        // Example 2
        List<Integer> nums2 = List.of(4, 3, 2, 1);
        int k2 = 2;
        System.out.println("Output 2: " + solution.sumIndicesWithKSetBits(nums2, k2)); // Expected output: 1
    }
}
