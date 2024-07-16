class AddStrings {
    public String addStrings(String num1, String num2) {
        // StringBuilder to build the resulting sum string
        StringBuilder result = new StringBuilder();
        
        // Variable to store the carry value during addition
        int carry = 0;
        
        // Pointers to iterate from the end of the strings
        int i = num1.length() - 1; // i = 1 (index of last character in "11")
        int j = num2.length() - 1; // j = 2 (index of last character in "123")

        // Iterate from the end of both strings to the beginning
        while (i >= 0 || j >= 0 || carry != 0) {
            // Convert character from num1 to integer, or 0 if index is out of bounds
            int x = i >= 0 ? num1.charAt(i) - '0' : 0; // First iteration: x = 1
            // Convert character from num2 to integer, or 0 if index is out of bounds
            int y = j >= 0 ? num2.charAt(j) - '0' : 0; // First iteration: y = 3

            // Calculate the sum of the digits and the carry
            int sum = x + y + carry; // First iteration: sum = 1 + 3 + 0 = 4
            // Update the carry for the next iteration
            carry = sum / 10; // First iteration: carry = 4 / 10 = 0
            // Append the least significant digit of the sum to the result
            result.append(sum % 10); // First iteration: result = "4"

            // Move to the next digits in the strings
            i--; // i = 0
            j--; // j = 1
        }

        // Example run for the remaining iterations:
        // Second iteration: x = 1, y = 2, sum = 3, carry = 0, result = "34"
        // Third iteration: x = 0, y = 1, sum = 1, carry = 0, result = "134"

        // Reverse the result since we added digits from least significant to most significant
        return result.reverse().toString(); // Reverse "431" to get "134"
    }

    public static void main(String[] args) {
        AddStrings sol = new AddStrings();
        
        // Example input
        String num1 = "11";
        String num2 = "123";
        
        // Get the result of adding the two numbers
        String result = sol.addStrings(num1, num2);
        
        // Print the result
        System.out.println(result); // Output: "134"
    }
}
