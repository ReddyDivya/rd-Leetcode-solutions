import java.util.ArrayList;
import java.util.List;

public class GrayCode {
    
    // Method to generate n-bit Gray code sequence
    public static List<Integer> grayCode(int n) {
        List<Integer> result = new ArrayList<>();
        int numGrayCodes = 1 << n;  // Total number of Gray codes = 2^n
        
        for (int i = 0; i < numGrayCodes; i++) {
            result.add(i ^ (i >> 1));  // Generating Gray code using formula
        }
        
        return result;
    }

    // Main method to test the grayCode method
    public static void main(String[] args) {
        int n = 2;  // Example input
        List<Integer> grayCodeSequence = grayCode(n);
        
        System.out.println("Gray Code sequence for n = " + n + ": " + grayCodeSequence);
    }
}
