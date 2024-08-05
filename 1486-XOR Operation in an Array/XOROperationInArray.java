public class XOROperationInArray {
    public static int xorOperation(int n, int start) {
        int result = 0;
        for (int i = 0; i < n; i++) {
            result ^= start + 2 * i;
        }
        return result;
    }

    public static void main(String[] args) {
        // Test Case 1
        int n1 = 5;
        int start1 = 0;
        System.out.println("Output: " + xorOperation(n1, start1)); // Output: 8

        // Test Case 2
        int n2 = 4;
        int start2 = 3;
        System.out.println("Output: " + xorOperation(n2, start2)); // Output: 8
    }
}
