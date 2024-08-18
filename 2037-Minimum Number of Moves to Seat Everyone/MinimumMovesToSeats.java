import java.util.Arrays;

public class MinimumMovesToSeats {
    public static int minMovesToSeat(int[] seats, int[] students) {
        // Sort both arrays
        Arrays.sort(seats);
        Arrays.sort(students);
        
        int moves = 0;

        // Calculate the sum of the absolute differences
        for (int i = 0; i < seats.length; i++) {
            moves += Math.abs(seats[i] - students[i]);
        }

        return moves;
    }

    public static void main(String[] args) {
        int[] seats1 = {3, 1, 5};
        int[] students1 = {2, 7, 4};
        System.out.println(minMovesToSeat(seats1, students1));  // Output: 4

        int[] seats2 = {4, 1, 5, 9};
        int[] students2 = {1, 3, 2, 6};
        System.out.println(minMovesToSeat(seats2, students2));  // Output: 7

        int[] seats3 = {2, 2, 6, 6};
        int[] students3 = {1, 3, 2, 6};
        System.out.println(minMovesToSeat(seats3, students3));  // Output: 4
    }
}
