class ToHex {
    public String toHex(int num) {
        // If the number is 0, just return "0"
        if (num == 0) {
            return "0";
        }
        
        // Prepare a string of hexadecimal characters
        char[] hexChars = "0123456789abcdef".toCharArray();
        StringBuilder hexString = new StringBuilder();
        
        // Convert 32-bit integer to hexadecimal, processing 4 bits at a time (since 1 hex digit = 4 bits)
        while (num != 0 && hexString.length() < 8) {  // limit to 8 characters for 32-bit integers
            int hexDigit = num & 0xF;  // Get the last 4 bits
            hexString.append(hexChars[hexDigit]);  // Append corresponding hex character
            num >>>= 4;  // Logical right shift by 4 bits (fills left with 0 for negative numbers)
        }
        
        // Since the hex digits were appended in reverse order, reverse the string before returning
        return hexString.reverse().toString();
    }

    public static void main(String[] args) {
        ToHex solution = new ToHex();
        
        // Test cases
        System.out.println(solution.toHex(26));   // Output: "1a"
        System.out.println(solution.toHex(-1));   // Output: "ffffffff"
        System.out.println(solution.toHex(0));    // Output: "0"
    }
}
