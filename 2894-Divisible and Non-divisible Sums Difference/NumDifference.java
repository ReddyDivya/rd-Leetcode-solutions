public class NumDifference {

    public static int calculateDifference(int n, int m) {
        int sumNotDivisibleByM = 0;
        int sumDivisibleByM = 0;

        for (int i = 1; i <= n; i++) {
            if (i % m == 0) {
                sumDivisibleByM += i;
            } else {
                sumNotDivisibleByM += i;
            }
        }

        return sumNotDivisibleByM - sumDivisibleByM;
    }

    public static void main(String[] args) {
        int n1 = 10, m1 = 3;
        int n2 = 5, m2 = 6;
        int n3 = 5, m3 = 1;

        System.out.println("Example 1: " + calculateDifference(n1, m1)); // Output: 19
        System.out.println("Example 2: " + calculateDifference(n2, m2)); // Output: 15
        System.out.println("Example 3: " + calculateDifference(n3, m3)); // Output: -15
    }
}
