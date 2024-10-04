public class Base7Converter {
    public static String convertToBase7(int num) {
        // Edge case: If the number is zero, return "0"
        if (num == 0) {
            return "0";
        }

        // Determine if the number is negative
        boolean isNegative = num < 0;
        num = Math.abs(num);

        StringBuilder base7 = new StringBuilder();

        // Perform the base 7 conversion
        while (num > 0) {
            base7.insert(0, num % 7);
            num /= 7;
        }

        // Add the negative sign if the original number was negative
        if (isNegative) {
            base7.insert(0, "-");
        }

        return base7.toString();
    }

    public static void main(String[] args) {
        // Test cases
        int num1 = 100;
        int num2 = -7;

        System.out.println("Base 7 representation of " + num1 + ": " + convertToBase7(num1));  // Output: "202"
        System.out.println("Base 7 representation of " + num2 + ": " + convertToBase7(num2));  // Output: "-10"
    }
}
