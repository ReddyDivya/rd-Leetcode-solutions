import java.util.HashSet;

public class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int left = 0, right = 0, maxLength = 0;
        
        while (right < s.length()) {
            // Try to add the character at right pointer to the set
            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                right++;
                maxLength = Math.max(maxLength, right - left);
            } else {
                // Remove the character at left pointer and move left pointer
                set.remove(s.charAt(left));
                left++;
            }
        }
        
        return maxLength;
    }
    
    public static void main(String[] args) {
        LengthOfLongestSubstring solution = new LengthOfLongestSubstring();
        
        String s1 = "abcabcbb";
        System.out.println("Output for s1: " + solution.lengthOfLongestSubstring(s1));  // Output: 3
        
        String s2 = "bbbbb";
        System.out.println("Output for s2: " + solution.lengthOfLongestSubstring(s2));  // Output: 1
        
        String s3 = "pwwkew";
        System.out.println("Output for s3: " + solution.lengthOfLongestSubstring(s3));  // Output: 3
    }
}
