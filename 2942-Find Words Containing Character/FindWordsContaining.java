import java.util.ArrayList;
import java.util.List;

class FindWordsContaining {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> indices = new ArrayList<>();
        
        for (int i = 0; i < words.length; i++) {
            if (words[i].indexOf(x) != -1) {
                indices.add(i);
            }
        }
        
        // Return the list of indices
        return indices;
    }

    public static void main(String[] args) {
        FindWordsContaining solution = new FindWordsContaining();

        // Test case 1
        String[] words1 = {"leet", "code"};
        char x1 = 'e';
        List<Integer> result1 = solution.findWordsContaining(words1, x1);
        System.out.println("Output 1: " + result1);  // Output: [0, 1]

        // Test case 2
        String[] words2 = {"abc", "bcd", "aaaa", "cbc"};
        char x2 = 'a';
        List<Integer> result2 = solution.findWordsContaining(words2, x2);
        System.out.println("Output 2: " + result2);  // Output: [0, 2]

        // Test case 3
        String[] words3 = {"abc", "bcd", "aaaa", "cbc"};
        char x3 = 'z';
        List<Integer> result3 = solution.findWordsContaining(words3, x3);
        System.out.println("Output 3: " + result3);  // Output: []
    }
}
