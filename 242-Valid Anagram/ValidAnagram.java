import java.util.HashMap;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        // If lengths of the strings are different, they cannot be anagrams
        if (s.length() != t.length()) {
            return false;
        }

        // Create a HashMap to count occurrences of each character in s
        HashMap<Character, Integer> hMap = new HashMap<>();

        // Iterate through the first string and count each character
        for (char ch : s.toCharArray()) {
            hMap.put(ch, hMap.getOrDefault(ch, 0) + 1);
        }

        // Iterate through the second string and decrease the count of each character
        for (char ch : t.toCharArray()) {
            // If character is not found or count is zero, not an anagram
            if (!hMap.containsKey(ch) || hMap.get(ch) == 0) {
                return false;
            }

            // Decrease the count of the character in the HashMap
            hMap.put(ch, hMap.get(ch) - 1);
        }

        // If all counts are zero, then the strings are anagrams
        return true;
    }

    public static void main(String[] args) {
        ValidAnagram solution = new ValidAnagram();

        String s1 = "anagram";
        String t1 = "nagaram";
        System.out.println(solution.isAnagram(s1, t1)); // Output: true

        String s2 = "rat";
        String t2 = "car";
        System.out.println(solution.isAnagram(s2, t2)); // Output: false
    }
}
