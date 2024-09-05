public class IntegerToRoman {
    public static String intToRoman(int num) {
        // Define arrays for Roman numeral symbols and their corresponding values
        String[] romanSymbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        // StringBuilder to store the result
        StringBuilder result = new StringBuilder();

        // Iterate through each value and symbol
        for (int i = 0; i < values.length; i++) {
            // Append the corresponding Roman numeral symbol while the number is greater than or equal to the value
            while (num >= values[i]) {
                result.append(romanSymbols[i]);
                num -= values[i];
            }
        }

        // Return the result as a string
        return result.toString();
    }

    // Main method to test the function
    public static void main(String[] args) {
        // Test cases
        System.out.println("3749 in Roman numerals is: " + intToRoman(3749));  // Output: MMMDCCXLIX
        System.out.println("58 in Roman numerals is: " + intToRoman(58));      // Output: LVIII
        System.out.println("1994 in Roman numerals is: " + intToRoman(1994));  // Output: MCMXCIV
    }
}
