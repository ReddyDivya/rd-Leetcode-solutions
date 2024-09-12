public class ClimbingStairs {

    // Method to calculate the number of distinct ways to reach the top
    public static int climbStairs(int n) {
        if (n <= 1) {
            return 1;
        }

        // Create an array to store the number of ways to reach each step
        int[] dp = new int[n + 1];

        // Base cases
        dp[0] = 1;  // 1 way to stay at step 0 (no step)
        dp[1] = 1;  // 1 way to reach step 1 (one step)

        // Fill the dp array for the remaining steps
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];  // You can reach step i either from step i-1 or step i-2
        }

        return dp[n];  // Return the number of ways to reach the top
    }

    // Main method for testing
    public static void main(String[] args) {
        int n = 2;
        System.out.println("Ways to climb " + n + " steps: " + climbStairs(n));  // Output: 2

        n = 3;
        System.out.println("Ways to climb " + n + " steps: " + climbStairs(n));  // Output: 3
    }
}
