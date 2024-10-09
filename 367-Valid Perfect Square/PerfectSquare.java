public class PerfectSquare {
    public static boolean isPerfectSquare(int num) {
        if (num < 1) {
            return false;
        }
        
        int left = 1, right = num;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            long square = (long) mid * mid;

            if (square == num) {
                return true;
            } else if (square < num) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int num1 = 16;
        int num2 = 14;
        
        System.out.println(isPerfectSquare(num1));  // Output: true
        System.out.println(isPerfectSquare(num2));  // Output: false
    }
}
