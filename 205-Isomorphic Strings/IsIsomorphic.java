class IsIsomorphic {
    public boolean isIsomorphic(String s, String t) {
        // Check if the lengths of the strings are different
        // If they are, they cannot be isomorphic
        if (s.length() != t.length())
            return false;

        // Create two arrays to store the mapping of characters
        // from s to t and from t to s
        int[] mapS = new int[256];
        int[] mapT = new int[256];

        // Iterate over each character in the strings
        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);

            // Check if the current mappings are consistent
            // If they are not, the strings are not isomorphic
            if (mapS[charS] != mapT[charT]) {
                return false;
            }

            // Update the mappings with the current index + 1
            // This ensures that 0 (initial value) is never mistaken for a valid index
            mapS[charS] = i + 1;
            mapT[charT] = i + 1;
        }

        // If all characters have been consistently mapped, the strings are isomorphic
        return true;
    }

    public static void main(String[] args) {
        IsIsomorphic solution = new IsIsomorphic();

        // Test cases
        String s1 = "egg";
        String t1 = "add";
        System.out.println(solution.isIsomorphic(s1, t1)); // true

        String s2 = "foo";
        String t2 = "bar";
        System.out.println(solution.isIsomorphic(s2, t2)); // false

        String s3 = "paper";
        String t3 = "title";
        System.out.println(solution.isIsomorphic(s3, t3)); // true

        String s4 = "ab";
        String t4 = "aa";
        System.out.println(solution.isIsomorphic(s4, t4)); // false

        String s5 = "abc";
        String t5 = "def";
        System.out.println(solution.isIsomorphic(s5, t5)); // true

        String s6 = "abcd";
        String t6 = "abdc";
        System.out.println(solution.isIsomorphic(s6, t6)); // false

        String s7 = "abcabc";
        String t7 = "xyzxyz";
        System.out.println(solution.isIsomorphic(s7, t7)); // true

        String s8 = "aabbcc";
        String t8 = "ddeeff";
        System.out.println(solution.isIsomorphic(s8, t8)); // true

        String s9 = "hello";
        String t9 = "world";
        System.out.println(solution.isIsomorphic(s9, t9)); // false

        String s10 = "abc";
        String t10 = "aaa";
        System.out.println(solution.isIsomorphic(s10, t10)); // false
    }
}
