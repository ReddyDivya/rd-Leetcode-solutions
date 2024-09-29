import java.util.ArrayList;
import java.util.List;

class SelfDividingNumbers {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();

        // Iterate through the range [left, right]
        for (int i = left; i <= right; i++) {
            if (isSelfDividing(i)) {
                result.add(i);
            }
        }

        return result;  // Return the list of self-dividing numbers
    }

    // Helper method to check if a number is self-dividing
    private boolean isSelfDividing(int num) {
        int original = num;

        // Check each digit in the number
        while (num > 0) {
            int digit = num % 10;  // Extract the last digit

            // If digit is 0 or number is not divisible by the digit, it's not self-dividing
            if (digit == 0 || original % digit != 0) {
                return false;
            }

            num /= 10;  // Remove the last digit
        }

        return true;  // All digits were valid and divisible
    }

    // Main method for testing
    public static void main(String[] args) {
        SelfDividingNumbers solution = new SelfDividingNumbers();

        // Test case 1
        int left1 = 1, right1 = 22;
        System.out.println(solution.selfDividingNumbers(left1, right1));  // Output: [1,2,3,4,5,6,7,8,9,11,12,15,22]

        // Test case 2
        int left2 = 47, right2 = 85;
        System.out.println(solution.selfDividingNumbers(left2, right2));  // Output: [48,55,66,77]
    }
}
