public class DigitalRoot {
    public static int addDigits(int num) {
        // Iteratively sum the digits until num has only one digit
        while (num >= 10) {
            num = sumOfDigits(num);
        }
        return num;
    }

    // Helper method to calculate the sum of digits
    private static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10; // Add the last digit
            num /= 10;       // Remove the last digit
        }
        return sum;
    }

    public static void main(String[] args) {
        // Example 1
        int num1 = 38;
        System.out.println("Input: " + num1 + "\nOutput: " + addDigits(num1));

        // Example 2
        int num2 = 0;
        System.out.println("Input: " + num2 + "\nOutput: " + addDigits(num2));
    }
}
