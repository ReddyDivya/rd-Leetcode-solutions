public class UglyNumber {

    // Method to check if the number is an ugly number
    public static boolean isUgly(int n) {
        if (n <= 0) {
            return false;  // Ugly numbers are positive, so return false if n is non-positive
        }
        
        // Divide n by 2, 3, and 5 as long as it's divisible by those numbers
        int[] primes = {2, 3, 5};
        for (int prime : primes) {
            while (n % prime == 0) {
                n /= prime;
            }
        }
        
        // If n becomes 1, it is an ugly number, otherwise it's not
        return n == 1;
    }

    // Main method to test the function
    public static void main(String[] args) {
        // Test cases
        int n1 = 6;
        int n2 = 1;
        int n3 = 14;

        System.out.println(n1 + " is an ugly number: " + isUgly(n1));  // Output: true
        System.out.println(n2 + " is an ugly number: " + isUgly(n2));  // Output: true
        System.out.println(n3 + " is an ugly number: " + isUgly(n3));  // Output: false
    }
}
