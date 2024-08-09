public class SumDivisibleBy3or5or7 {

    public static int sumOfDivisibles(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int n1 = 7;
        int n2 = 10;
        int n3 = 9;

        System.out.println("Sum of numbers divisible by 3, 5, or 7 in range [1, " + n1 + "] is: " + sumOfDivisibles(n1));
        System.out.println("Sum of numbers divisible by 3, 5, or 7 in range [1, " + n2 + "] is: " + sumOfDivisibles(n2));
        System.out.println("Sum of numbers divisible by 3, 5, or 7 in range [1, " + n3 + "] is: " + sumOfDivisibles(n3));
    }
}
