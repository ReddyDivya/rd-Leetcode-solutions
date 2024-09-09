class MyPow {
    public double myPow(double x, int n) {
        if (n == 0) {
            return 1; // x^0 is 1
        }
        if (n < 0) {
            x = 1 / x; // Convert x^(-n) to (1/x)^n
            n = -n;    // Convert n to positive
        }
        return powHelper(x, n);
    }

    private double powHelper(double x, int n) {
        if (n == 0) {
            return 1; // Base case: x^0 is 1
        }
        double half = powHelper(x, n / 2);
        if (n % 2 == 0) {
            return half * half; // If n is even
        } else {
            return half * half * x; // If n is odd
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.myPow(2.00000, 10));   // Output: 1024.00000
        System.out.println(sol.myPow(2.10000, 3));    // Output: 9.26100
        System.out.println(sol.myPow(2.00000, -2));   // Output: 0.25000
    }
}
