class SubrectangleQueries {
    private int[][] rectangle;

    // Constructor to initialize the rectangle matrix
    public SubrectangleQueries(int[][] rectangle) {
        this.rectangle = rectangle;
    }

    // Method to update the subrectangle with a new value
    public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
        for (int i = row1; i <= row2; i++) {
            for (int j = col1; j <= col2; j++) {
                rectangle[i][j] = newValue;
            }
        }
    }

    // Method to get the value at a specific coordinate
    public int getValue(int row, int col) {
        return rectangle[row][col];
    }

    public static void main(String[] args) {
        // Initialize a 4x3 rectangle
        int[][] rect1 = {
            {1, 2, 1},
            {4, 3, 4},
            {3, 2, 1},
            {1, 1, 1}
        };

        // Instantiate the SubrectangleQueries class with the initial matrix
        SubrectangleQueries subrectangleQueries = new SubrectangleQueries(rect1);

        // Test getValue method
        System.out.println(subrectangleQueries.getValue(0, 2)); // Output: 1

        // Test updateSubrectangle method
        subrectangleQueries.updateSubrectangle(0, 0, 3, 2, 5);
        
        // Check the updated values
        System.out.println(subrectangleQueries.getValue(0, 2)); // Output: 5
        System.out.println(subrectangleQueries.getValue(3, 1)); // Output: 5

        // Another updateSubrectangle test
        subrectangleQueries.updateSubrectangle(3, 0, 3, 2, 10);
        
        // Check updated values after the second update
        System.out.println(subrectangleQueries.getValue(3, 1)); // Output: 10
        System.out.println(subrectangleQueries.getValue(0, 2)); // Output: 5
    }
}
