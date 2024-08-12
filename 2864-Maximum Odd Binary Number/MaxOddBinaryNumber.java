public class MaxOddBinaryNumber {

    public static String maximumOddBinaryNumber(String s) {
        int countOnes = 0;
        int countZeros = 0;

        // Count the number of '1's and '0's in the string
        for (char c : s.toCharArray()) {
            if (c == '1') {
                countOnes++;
            } else {
                countZeros++;
            }
        }

        // Construct the result with the maximum odd binary number
        // Place all '1's except one at the beginning, followed by all '0's, and then the last '1' to ensure it's odd
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < countOnes - 1; i++) {
            result.append('1');
        }
        for (int i = 0; i < countZeros; i++) {
            result.append('0');
        }
        result.append('1');

        return result.toString();
    }

    public static void main(String[] args) {
        // Test cases
        String s1 = "010";
        String s2 = "0101";

        System.out.println("Input: " + s1 + " => Output: " + maximumOddBinaryNumber(s1)); // Output: "001"
        System.out.println("Input: " + s2 + " => Output: " + maximumOddBinaryNumber(s2)); // Output: "1001"
    }
}
