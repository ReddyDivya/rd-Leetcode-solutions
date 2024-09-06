public class DivideTwoIntegers {
    public int divide(int dividend, int divisor) {
        // Handle edge case: if dividend is Integer.MIN_VALUE and divisor is -1, return Integer.MAX_VALUE
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        
        // Determine the sign of the result
        boolean isNegative = (dividend < 0) ^ (divisor < 0);
        
        // Convert both dividend and divisor to positive values
        long dividendL = Math.abs((long) dividend);
        long divisorL = Math.abs((long) divisor);
        
        int result = 0;
        
        // Subtract divisor from dividend until dividend becomes smaller than divisor
        while (dividendL >= divisorL) {
            long tempDivisor = divisorL, multiple = 1;
            
            // Double the divisor to perform fast subtraction
            while (dividendL >= (tempDivisor << 1)) {
                tempDivisor <<= 1;
                multiple <<= 1;
            }
            
            // Subtract the largest doubled divisor and add multiples to the result
            dividendL -= tempDivisor;
            result += multiple;
        }
        
        // If the result is negative, return the negative value
        return isNegative ? -result : result;
    }

    public static void main(String[] args) {
        DivideTwoIntegers solution = new DivideTwoIntegers();
        
        System.out.println(solution.divide(10, 3)); // Output: 3
        System.out.println(solution.divide(7, -3)); // Output: -2
    }
}
