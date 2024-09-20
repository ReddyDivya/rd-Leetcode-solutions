import java.util.HashMap;
import java.util.Map;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> magazineMap = new HashMap<>();

        // Count the frequency of each letter in the magazine
        for (char c : magazine.toCharArray()) {
            magazineMap.put(c, magazineMap.getOrDefault(c, 0) + 1);
        }

        // Check if ransomNote can be constructed from magazine
        for (char c : ransomNote.toCharArray()) {
            if (!magazineMap.containsKey(c) || magazineMap.get(c) == 0) {
                return false; // Letter not available or not enough occurrences
            }
            magazineMap.put(c, magazineMap.get(c) - 1);
        }

        return true;
    }

    public static void main(String[] args) {
        RansomNote solution = new RansomNote();

        // Test cases
        System.out.println(solution.canConstruct("a", "b")); // Output: false
        System.out.println(solution.canConstruct("aa", "ab")); // Output: false
        System.out.println(solution.canConstruct("aa", "aab")); // Output: true
    }
}
