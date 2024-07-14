public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";

        String prefix = strs[0]; // initial string as a prefix -> "flower"

        for (int i = 1; i < strs.length; i++) {
            // comparing strings with the prefix
            // Case 1: comparing "flow" with prefix->"flower" -> finally update prefix = "flow"
            // Case 2: comparing "flight" with updated prefix->"flow" -> finally update prefix = "fl"
            while (strs[i].indexOf(prefix) != 0) // if prefix is not a part of string then reduce one character
            {
                // Reduce the prefix by one character from the end until a match is found
                prefix = prefix.substring(0, prefix.length() - 1);

                // If the prefix becomes empty, there is no common prefix
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }

    public static void main(String[] args) {
        LongestCommonPrefix solution = new LongestCommonPrefix();

        // Example 1
        String[] strs1 = {"flower", "flow", "flight"};
        System.out.println("Longest Common Prefix: " + solution.longestCommonPrefix(strs1));

        // Example 2
        String[] strs2 = {"dog", "racecar", "car"};
        System.out.println("Longest Common Prefix: " + solution.longestCommonPrefix(strs2));
    }
}
