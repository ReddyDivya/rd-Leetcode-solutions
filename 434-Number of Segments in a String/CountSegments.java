class CountSegments {
    public int countSegments(String s) {
        // Initialize a counter for the number of segments
        int count = 0;
        
        // Get the length of the input string
        int n = s.length();
        System.out.println("n >> " + n); // Print the length of the string

        // Loop through each character in the string
        for (int i = 0; i < n; i++) {
            // Print the current index
            System.out.println("i >> " + i);
            
            // Check if the current character is not a space and
            // it is either the first character or the previous character is a space
            if (s.charAt(i) != ' ' && (i == 0 || s.charAt(i - 1) == ' ')) {
                // Increment the segment count
                count++;
                // Print the current segment count
                System.out.println("count >> " + count);
            }
        }
        
        // Return the total number of segments
        return count;
    }

    public static void main(String[] args) {
        CountSegments solution = new CountSegments();
        
        // Example input
        String s = "Hello, my name is John";
        
        // Calling the countSegments method and printing the result
        int result = solution.countSegments(s);
        
        // Output: Number of segments: 5
        System.out.println("Number of segments: " + result);
    }
}
