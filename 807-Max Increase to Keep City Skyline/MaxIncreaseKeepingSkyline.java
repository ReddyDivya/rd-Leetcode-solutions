public class MaxIncreaseKeepingSkyline {

    public static int maxIncreaseKeepingSkyline(int[][] grid) {
        int n = grid.length;
        
        // Arrays to store the max height of buildings from the row and column perspectives
        int[] rowMax = new int[n];
        int[] colMax = new int[n];
        
        // Find the maximum for each row and each column
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rowMax[i] = Math.max(rowMax[i], grid[i][j]);
                colMax[j] = Math.max(colMax[j], grid[i][j]);
            }
        }
        
        int maxIncrease = 0;
        
        // Calculate the maximum increase for each building without changing the skyline
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // The new height for each building cannot exceed the minimum of the row max and column max
                int limitHeight = Math.min(rowMax[i], colMax[j]);
                maxIncrease += limitHeight - grid[i][j];
            }
        }
        
        return maxIncrease;
    }

    public static void main(String[] args) {
        // Example test case
        int[][] grid = {
            {3, 0, 8, 4},
            {2, 4, 5, 7},
            {9, 2, 6, 3},
            {0, 3, 1, 0}
        };
        
        int result = maxIncreaseKeepingSkyline(grid);
        System.out.println("Maximum total increase: " + result); // Output: 35
    }
}
