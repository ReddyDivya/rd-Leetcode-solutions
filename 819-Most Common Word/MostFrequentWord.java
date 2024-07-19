import java.util.*;

public class MostFrequentWord {
    public static String mostCommonWord(String paragraph, String[] banned) {
        // Convert banned array to a set for faster lookup
        Set<String> bannedSet = new HashSet<>(Arrays.asList(banned));
        
        // Replace all punctuations with spaces and convert to lowercase
        String normalizedStr = paragraph.replaceAll("[^a-zA-Z]", " ").toLowerCase();
        
        // Split the paragraph into words
        String[] words = normalizedStr.split("\\s+");
        
        // Use a hashmap to count the frequency of each word
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            if (!bannedSet.contains(word)) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }
        
        // Find the word with the highest frequency that is not banned
        String mostCommon = "";
        int maxCount = 0;
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() > maxCount) {
                mostCommon = entry.getKey();
                maxCount = entry.getValue();
            }
        }
        
        return mostCommon;
    }

    public static void main(String[] args) {
        String paragraph1 = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] banned1 = {"hit"};
        System.out.println(mostCommonWord(paragraph1, banned1)); // Output: "ball"

        String paragraph2 = "a.";
        String[] banned2 = {};
        System.out.println(mostCommonWord(paragraph2, banned2)); // Output: "a"
    }
}
