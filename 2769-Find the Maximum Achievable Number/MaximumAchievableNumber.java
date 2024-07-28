public class MaximumAchievableNumber {
    public static int maximumAchievableNumber(int num, int t) {
        return num + 2 * t;
    }

    public static void main(String[] args) {
        int num1 = 4;
        int t1 = 1;
        System.out.println("Input: num = " + num1 + ", t = " + t1);
        System.out.println("Output: " + maximumAchievableNumber(num1, t1)); // Output: 6

        int num2 = 3;
        int t2 = 2;
        System.out.println("Input: num = " + num2 + ", t = " + t2);
        System.out.println("Output: " + maximumAchievableNumber(num2, t2)); // Output: 7
    }
}
