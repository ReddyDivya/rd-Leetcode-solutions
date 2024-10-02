class LargestTriangleArea {
    // Helper method to calculate the area of a triangle using its three points
    private double triangleArea(int[] p1, int[] p2, int[] p3) {
        // Using the formula: Area = 0.5 * |x1*(y2 - y3) + x2*(y3 - y1) + x3*(y1 - y2)|
        return 0.5 * Math.abs(p1[0] * (p2[1] - p3[1]) + p2[0] * (p3[1] - p1[1]) + p3[0] * (p1[1] - p2[1]));
    }

    // Main method to find the largest triangle area from the given points
    public double largestTriangleArea(int[][] points) {
        int n = points.length;
        double maxArea = 0.0;
        
        // Iterate over all possible combinations of three points
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    // Calculate the area of the triangle formed by points[i], points[j], points[k]
                    double area = triangleArea(points[i], points[j], points[k]);
                    // Update the maximum area if the current area is larger
                    maxArea = Math.max(maxArea, area);
                }
            }
        }
        return maxArea;
    }
}
