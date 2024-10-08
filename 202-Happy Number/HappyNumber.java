import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

    // Method to determine if a number is a happy number
    public static boolean isHappy(int n) {
        Set<Integer> seenNumbers = new HashSet<>();

        while (n != 1 && !seenNumbers.contains(n)) {
            seenNumbers.add(n);
            n = getSumOfSquares(n);
        }

        return n == 1;
    }

    // Helper method to calculate the sum of squares of digits of a number
    private static int getSumOfSquares(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        int n1 = 19;
        int n2 = 2;

        System.out.println("Is " + n1 + " a happy number? " + isHappy(n1)); // Output: true
        System.out.println("Is " + n2 + " a happy number? " + isHappy(n2)); // Output: false
    }
}
