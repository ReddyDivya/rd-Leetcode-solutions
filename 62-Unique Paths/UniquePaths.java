public class UniquePaths {

    public static int uniquePaths(int m, int n) {
        // Create a 2D array to store the number of paths at each grid cell
        int[][] dp = new int[m][n];

        // Initialize the first row and first column to 1
        // There's only one way to move either all the way right or all the way down
        for (int i = 0; i < m; i++) {
            dp[i][0] = 1;
        }
        for (int j = 0; j < n; j++) {
            dp[0][j] = 1;
        }

        // Fill in the rest of the grid
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                // The number of ways to get to this cell is the sum of the ways to get
                // to the cell above it and the cell to the left of it
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }

        // The bottom-right corner will have the total number of unique paths
        return dp[m - 1][n - 1];
    }

    public static void main(String[] args) {
        // Example 1
        int m1 = 3;
        int n1 = 7;
        System.out.println("Number of unique paths for grid " + m1 + "x" + n1 + ": " + uniquePaths(m1, n1)); // Output: 28

        // Example 2
        int m2 = 3;
        int n2 = 2;
        System.out.println("Number of unique paths for grid " + m2 + "x" + n2 + ": " + uniquePaths(m2, n2)); // Output: 3
    }
}
