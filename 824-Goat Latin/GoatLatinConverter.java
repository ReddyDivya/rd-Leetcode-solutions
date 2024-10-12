public class GoatLatinConverter {

    // Method to check if a character is a vowel
    private static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    // Method to convert a sentence to Goat Latin
    public static String toGoatLatin(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        // Iterate through each word in the sentence
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            StringBuilder goatWord = new StringBuilder();

            // If the word starts with a vowel, append "ma" to the end
            if (isVowel(word.charAt(0))) {
                goatWord.append(word);
            } 
            // If the word starts with a consonant, move the first letter to the end and then append "ma"
            else {
                goatWord.append(word.substring(1)).append(word.charAt(0));
            }

            // Append "ma" to the word
            goatWord.append("ma");

            // Add 'a' to the end of the word for each word's index (starting from 1)
            for (int j = 0; j <= i; j++) {
                goatWord.append('a');
            }

            // Add the transformed word to the result
            result.append(goatWord);

            // Add space between words, except for the last word
            if (i < words.length - 1) {
                result.append(" ");
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String sentence = "I speak Goat Latin";
        String goatLatin = toGoatLatin(sentence);
        System.out.println(goatLatin);
    }
}
