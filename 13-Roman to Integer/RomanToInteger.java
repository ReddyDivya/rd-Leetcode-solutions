public class RomanToInteger {
    public static void main(String[] args) {
        // Example usage
        System.out.println(romanToInt("III"));       // Output: 3
        System.out.println(romanToInt("LVIII"));     // Output: 58
        System.out.println(romanToInt("MCMXCIV"));   // Output: 1994
    }

    public static int romanToInt(String s) {
        int result = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            int current = value(s.charAt(i));
            if (i < n - 1 && current < value(s.charAt(i + 1))) {
                result -= current;
            } else {
                result += current;
            }
        }
        
        return result;
    }

    private static int value(char roman) {
        switch (roman) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: throw new IllegalArgumentException("Invalid Roman numeral character");
        }
    }
}
