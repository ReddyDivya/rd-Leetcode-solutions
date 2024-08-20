import java.util.Arrays;

public class WidestVerticalArea {
    public static int maxWidthOfVerticalArea(int[][] points) {
        // Extract all x-coordinates from points
        int[] xCoordinates = new int[points.length];
        for (int i = 0; i < points.length; i++) {
            xCoordinates[i] = points[i][0];
        }

        // Sort the x-coordinates
        Arrays.sort(xCoordinates);

        // Find the maximum width between consecutive x-coordinates
        int maxWidth = 0;
        for (int i = 1; i < xCoordinates.length; i++) {
            maxWidth = Math.max(maxWidth, xCoordinates[i] - xCoordinates[i - 1]);
        }

        return maxWidth;
    }

    public static void main(String[] args) {
        int[][] points1 = {{8,7}, {9,9}, {7,4}, {9,7}};
        System.out.println("Output: " + maxWidthOfVerticalArea(points1)); // Output: 1

        int[][] points2 = {{3,1}, {9,0}, {1,0}, {1,4}, {5,3}, {8,8}};
        System.out.println("Output: " + maxWidthOfVerticalArea(points2)); // Output: 3
    }
}
