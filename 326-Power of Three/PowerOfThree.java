public class PowerOfThree {

    public static boolean isPowerOfThree(int n) {
        // Base case: n must be greater than 0 to be a power of three
        if (n <= 0) {
            return false;
        }
        
        // Loop to keep dividing n by 3 as long as it's divisible
        while (n % 3 == 0) {
            n /= 3;
        }
        
        // If n becomes 1, it means it's a power of three
        return n == 1;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(isPowerOfThree(27));  // true
        System.out.println(isPowerOfThree(0));   // false
        System.out.println(isPowerOfThree(-1));  // false
        System.out.println(isPowerOfThree(9));   // true
        System.out.println(isPowerOfThree(45));  // false
    }
}
