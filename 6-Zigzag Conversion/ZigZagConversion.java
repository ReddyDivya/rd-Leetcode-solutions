public class ZigZagConversion {

    public String convert(String s, int numRows) {
        // If the number of rows is 1 or the string length is less than the number of rows, return the original string
        if (numRows == 1 || s.length() <= numRows) {
            return s;
        }

        // Create an array of StringBuilder to store each row's characters
        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        // Variables to keep track of the current row and direction of traversal
        int currentRow = 0;
        boolean goingDown = false;

        // Loop through the characters of the input string
        for (char c : s.toCharArray()) {
            rows[currentRow].append(c);  // Add the character to the current row

            // Change direction when reaching the top or bottom row
            if (currentRow == 0 || currentRow == numRows - 1) {
                goingDown = !goingDown;
            }

            // Move to the next row (either up or down)
            currentRow += goingDown ? 1 : -1;
        }

        // Combine all rows into a single result string
        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        ZigZagConversion solution = new ZigZagConversion();

        // Test cases
        String s1 = "PAYPALISHIRING";
        int numRows1 = 3;
        System.out.println(solution.convert(s1, numRows1));  // Output: "PAHNAPLSIIGYIR"

        String s2 = "PAYPALISHIRING";
        int numRows2 = 4;
        System.out.println(solution.convert(s2, numRows2));  // Output: "PINALSIGYAHRPI"

        String s3 = "A";
        int numRows3 = 1;
        System.out.println(solution.convert(s3, numRows3));  // Output: "A"
    }
}
