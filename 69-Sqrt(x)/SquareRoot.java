public class SquareRoot {

    // Method to find the square root of x
    public static int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }

        int start = 1, end = x, result = 0;

        // Binary search to find the square root
        while (start <= end) {
            int mid = start + (end - start) / 2;

            // If mid*mid is equal to x, mid is the answer
            if (mid == x / mid) {
                return mid;
            }

            // If mid*mid is less than x, discard the left half
            if (mid < x / mid) {
                start = mid + 1;
                result = mid;  // Update the result to mid as a potential answer
            } else {
                // If mid*mid is greater than x, discard the right half
                end = mid - 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        // Test cases
        int x1 = 4;
        System.out.println("Square root of " + x1 + " is: " + mySqrt(x1)); // Output: 2

        int x2 = 8;
        System.out.println("Square root of " + x2 + " is: " + mySqrt(x2)); // Output: 2
    }
}
