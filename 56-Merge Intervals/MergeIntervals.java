import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    
    public int[][] merge(int[][] intervals) {
        // Edge case: if the input array is empty or has only one interval, return it as is
        if (intervals.length <= 1) {
            return intervals;
        }

        // Sort the intervals by their start times
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        // List to hold the merged intervals
        List<int[]> merged = new ArrayList<>();

        // Initialize the first interval as the current interval to merge
        int[] currentInterval = intervals[0];
        merged.add(currentInterval);

        // Loop through the intervals and merge overlapping ones
        for (int[] interval : intervals) {
            int currentEnd = currentInterval[1];
            int nextStart = interval[0];
            int nextEnd = interval[1];

            // If the current interval overlaps with the next one, merge them
            if (currentEnd >= nextStart) {
                currentInterval[1] = Math.max(currentEnd, nextEnd);
            } else {
                // Otherwise, move to the next interval
                currentInterval = interval;
                merged.add(currentInterval);
            }
        }

        // Convert the merged list back to a 2D array and return it
        return merged.toArray(new int[merged.size()][]);
    }

    public static void main(String[] args) {
        MergeIntervals solution = new MergeIntervals();

        // Example 1: intervals = [[1,3],[2,6],[8,10],[15,18]]
        int[][] intervals1 = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] result1 = solution.merge(intervals1);
        System.out.println(Arrays.deepToString(result1));  // Output: [[1, 6], [8, 10], [15, 18]]

        // Example 2: intervals = [[1,4],[4,5]]
        int[][] intervals2 = {{1, 4}, {4, 5}};
        int[][] result2 = solution.merge(intervals2);
        System.out.println(Arrays.deepToString(result2));  // Output: [[1, 5]]
    }
}
