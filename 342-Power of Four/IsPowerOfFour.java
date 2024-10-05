class IsPowerOfFour {
    public boolean isPowerOfFour(int n) {
        // A number must be greater than 0 and a power of two (only one bit set)
        // Additionally, that bit must be in an odd position for it to be a power of four
        return n > 0 && (n & (n - 1)) == 0 && (n & 0x55555555) != 0;
    }

    public static void main(String[] args) {
        IsPowerOfFour solution = new IsPowerOfFour();
        
        // Test cases
        System.out.println(solution.isPowerOfFour(16)); // Output: true
        System.out.println(solution.isPowerOfFour(5));  // Output: false
        System.out.println(solution.isPowerOfFour(1));  // Output: true
    }
}
