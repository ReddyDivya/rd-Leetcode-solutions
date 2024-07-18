public class LongestUncommonSubsequence {
    public static void main(String[] args) {
        System.out.println(findLUSlength("aba", "cdc")); // 3
        System.out.println(findLUSlength("aaa", "bbb")); // 3
        System.out.println(findLUSlength("aaa", "aaa")); // -1
    }

    public static int findLUSlength(String a, String b) {
        // If the two strings are equal, there is no uncommon subsequence
        if (a.equals(b)) {
            return -1;
        }
        // Otherwise, the longest uncommon subsequence will be the length of the longer string
        // since it cannot be a subsequence of the other string
        return Math.max(a.length(), b.length());
    }
}
