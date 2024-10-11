import java.util.Arrays;

class SumZero {
    public int[] sumZero(int n) {
        // Create an array to store the result
        int[] result = new int[n];
        
        // Fill the array with unique integers that sum to 0
        int value = 1;
        for (int i = 0; i < n / 2; i++) {
            result[i] = value;          // Positive value
            result[n - i - 1] = -value; // Corresponding negative value
            value++;
        }

        // If n is odd, set the middle element to 0
        if (n % 2 != 0) {
            result[n / 2] = 0;
        }
        
        return result;
    }

    public static void main(String[] args) {
        SumZero sol = new SumZero();
        
        // Example 1
        System.out.println(Arrays.toString(sol.sumZero(5))); // Output: [-2, -1, 0, 1, 2]
        
        // Example 2
        System.out.println(Arrays.toString(sol.sumZero(3))); // Output: [-1, 0, 1]
        
        // Example 3
        System.out.println(Arrays.toString(sol.sumZero(1))); // Output: [0]
    }
}
