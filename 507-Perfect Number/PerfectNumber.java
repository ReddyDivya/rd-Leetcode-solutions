public class PerfectNumber {

    // Method to check if the number is a perfect number
    public static boolean isPerfectNumber(int num) {
        if (num <= 1) {
            return false; // No perfect number is less than or equal to 1
        }

        int sum = 0;

        // Find all divisors of num and sum them up (excluding the number itself)
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        // If the sum of divisors equals num, it's a perfect number
        return sum == num;
    }

    // Main method to test the function
    public static void main(String[] args) {
        // Test cases
        int num1 = 28;
        int num2 = 7;

        System.out.println(num1 + " is a perfect number: " + isPerfectNumber(num1));  // Output: true
        System.out.println(num2 + " is a perfect number: " + isPerfectNumber(num2));  // Output: false
    }
}
