public class CapitalUsage {
    public static void main(String[] args) {
        // Test cases to check the functionality of detectCapitalUse method
        System.out.println(detectCapitalUse("USA")); // true, all capitals
        System.out.println(detectCapitalUse("leetcode")); // true, all lowercase
        System.out.println(detectCapitalUse("Google")); // true, first capital rest lowercase
        System.out.println(detectCapitalUse("FlaG")); // false, incorrect usage of capitals
    }

    // Method to check the correct usage of capitals in a word
    public static boolean detectCapitalUse(String word) {
        int n = word.length(); // Get the length of the word
        if (n == 0) return true; // If the word is empty, return true (considered correct)

        // Assume all characters are uppercase initially
        boolean allCaps = true;
        // Assume all characters are lowercase initially
        boolean allLower = true;
        // Check if the first character is uppercase and assume rest are lowercase
        boolean firstCapRestLower = Character.isUpperCase(word.charAt(0));

        // Loop through each character in the word
        for (int i = 0; i < n; i++) {
            // If the current character is lowercase, allCaps is false
            if (Character.isLowerCase(word.charAt(i))) {
                allCaps = false;
            } else { // If the current character is uppercase
                allLower = false; // allLower is false
                if (i > 0) { // If this is not the first character
                    firstCapRestLower = false; // firstCapRestLower is false
                }
            }

            // Early return if more than one condition fails
            if (!allCaps && !allLower && !firstCapRestLower) {
                return false; // Return false if more than one condition fails
            }
        }

        // Return true if any one of the conditions is still valid
        return allCaps || allLower || firstCapRestLower;
    }
}
