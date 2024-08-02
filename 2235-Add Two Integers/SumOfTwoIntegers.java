public class SumOfTwoIntegers {
    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        // Test cases
        int num1_1 = 12, num2_1 = 5;
        int num1_2 = -10, num2_2 = 4;

        System.out.println("Input: num1 = " + num1_1 + ", num2 = " + num2_1);
        System.out.println("Output: " + sum(num1_1, num2_1));
        
        System.out.println("Input: num1 = " + num1_2 + ", num2 = " + num2_2);
        System.out.println("Output: " + sum(num1_2, num2_2));
    }
}
