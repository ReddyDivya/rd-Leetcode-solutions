public class ReverseStringKGroup {

    public static String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();
        
        for (int start = 0; start < arr.length; start += 2 * k) {
            int i = start;
            int j = Math.min(start + k - 1, arr.length - 1);
            while (i < j) {
                // Swap characters
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        
        return new String(arr);
    }

    public static void main(String[] args) {
        System.out.println(reverseStr("abcdefg", 2)); // Output: "bacdfeg"
        System.out.println(reverseStr("abcd", 2));    // Output: "bacd"
    }
}
