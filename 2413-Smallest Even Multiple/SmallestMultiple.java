public class SmallestMultiple {
    public static int smallestMultiple(int n) {
        return n % 2 == 0 ? n : n * 2;
    }

    public static void main(String[] args) {
        // Test cases
        int n1 = 5;
        int n2 = 6;

        System.out.println("Input: " + n1);
        System.out.println("Output: " + smallestMultiple(n1));
        System.out.println("Input: " + n2);
        System.out.println("Output: " + smallestMultiple(n2));
    }
}
