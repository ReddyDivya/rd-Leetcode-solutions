public class StringToInteger {
    public static int myAtoi(String s) {
        // Step 1: Ignore leading whitespace
        s = s.trim();
        if (s.isEmpty()) {
            return 0;
        }

        // Step 2: Determine the sign
        int sign = 1;
        int index = 0;
        if (s.charAt(index) == '-') {
            sign = -1;
            index++;
        } else if (s.charAt(index) == '+') {
            index++;
        }

        // Step 3: Read the integer
        long result = 0;
        while (index < s.length() && Character.isDigit(s.charAt(index))) {
            result = result * 10 + (s.charAt(index) - '0');
            index++;

            // Step 4: Check for overflow/underflow
            if (result * sign >= Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (result * sign <= Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
        }

        return (int) (result * sign);
    }

    public static void main(String[] args) {
        String input1 = "42";
        System.out.println(myAtoi(input1)); // Output: 42

        String input2 = " -042";
        System.out.println(myAtoi(input2)); // Output: -42

        String input3 = "1337c0d3";
        System.out.println(myAtoi(input3)); // Output: 1337

        String input4 = "0-1";
        System.out.println(myAtoi(input4)); // Output: 0

        String input5 = "words and 987";
        System.out.println(myAtoi(input5)); // Output: 0
    }
}
