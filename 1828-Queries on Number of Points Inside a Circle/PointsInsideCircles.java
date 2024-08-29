import java.util.ArrayList;
import java.util.List;

public class PointsInsideCircles {

    public static void main(String[] args) {
        int[][] points = {{1, 3}, {3, 3}, {5, 3}, {2, 2}};
        int[][] queries = {{2, 3, 1}, {4, 3, 1}, {1, 1, 2}};
        int[] result = countPoints(points, queries);

        // Print the result
        for (int count : result) {
            System.out.print(count + " ");
        }
    }

    public static int[] countPoints(int[][] points, int[][] queries) {
        int[] result = new int[queries.length];

        for (int q = 0; q < queries.length; q++) {
            int xj = queries[q][0];
            int yj = queries[q][1];
            int rj = queries[q][2];
            int count = 0;

            for (int[] point : points) {
                int xi = point[0];
                int yi = point[1];
                // Calculate the distance squared between the point and the circle center
                int dx = xi - xj;
                int dy = yi - yj;
                if (dx * dx + dy * dy <= rj * rj) {
                    count++;
                }
            }

            result[q] = count;
        }

        return result;
    }
}
