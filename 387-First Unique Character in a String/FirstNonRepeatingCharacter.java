import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
    public static int firstUniqChar(String s) {
        // Create a HashMap to store character frequencies
        Map<Character, Integer> frequencyMap = new HashMap<>();
        
        // Fill the frequency map with the count of each character
        for (char c : s.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        
        // Traverse the string again to find the first non-repeating character
        for (int i = 0; i < s.length(); i++) {
            if (frequencyMap.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        
        // If no non-repeating character is found, return -1
        return -1;
    }

    public static void main(String[] args) {
        // Test cases
        String s1 = "leetcode";
        String s2 = "loveleetcode";
        String s3 = "aabb";
        
        System.out.println("Input: " + s1 + " | Output: " + firstUniqChar(s1));
        System.out.println("Input: " + s2 + " | Output: " + firstUniqChar(s2));
        System.out.println("Input: " + s3 + " | Output: " + firstUniqChar(s3));
    }
}
