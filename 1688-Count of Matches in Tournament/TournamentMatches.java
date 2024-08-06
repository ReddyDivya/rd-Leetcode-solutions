public class TournamentMatches {
    public static int numberOfMatches(int n) {
        int totalMatches = 0;
        while (n > 1) {
            if (n % 2 == 0) {
                totalMatches += n / 2;
                n = n / 2;
            } else {
                totalMatches += (n - 1) / 2;
                n = (n - 1) / 2 + 1;
            }
        }
        return totalMatches;
    }

    public static void main(String[] args) {
        int n1 = 7;
        int n2 = 14;

        System.out.println("Input: n = " + n1);
        System.out.println("Output: " + numberOfMatches(n1));
        // Expected Output: 6

        System.out.println("Input: n = " + n2);
        System.out.println("Output: " + numberOfMatches(n2));
        // Expected Output: 13
    }
}
