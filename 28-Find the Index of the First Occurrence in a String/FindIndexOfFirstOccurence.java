class Solution {
    public int strStr(String haystack, String needle) {
        int index = haystack.indexOf(needle);
        return index;
    }
    
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Example 1
        String haystack1 = "hello";
        String needle1 = "ll";
        int result1 = solution.strStr(haystack1, needle1);
        System.out.println("Index of the first occurrence of \"" + needle1 + "\" in \"" + haystack1 + "\": " + result1);
        
        // Example 2
        String haystack2 = "aaaaa";
        String needle2 = "bba";
        int result2 = solution.strStr(haystack2, needle2);
        System.out.println("Index of the first occurrence of \"" + needle2 + "\" in \"" + haystack2 + "\": " + result2);
        
        // Example 3
        String haystack3 = "";
        String needle3 = "";
        int result3 = solution.strStr(haystack3, needle3);
        System.out.println("Index of the first occurrence of \"" + needle3 + "\" in \"" + haystack3 + "\": " + result3);
    }
}
