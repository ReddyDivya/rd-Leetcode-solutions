public class DigitDivisorCounter {

    public static int countDigitsThatDivideNum(int num) {
        int count = 0;
        int originalNum = num;

        while (num > 0) {
            int digit = num % 10;
            if (digit != 0 && originalNum % digit == 0) {
                count++;
            }
            num /= 10;
        }

        return count;
    }

    public static void main(String[] args) {
        int num1 = 7;
        int num2 = 121;
        int num3 = 1248;

        System.out.println("Number of digits in " + num1 + " that divide the number: " + countDigitsThatDivideNum(num1)); // Output: 1
        System.out.println("Number of digits in " + num2 + " that divide the number: " + countDigitsThatDivideNum(num2)); // Output: 2
        System.out.println("Number of digits in " + num3 + " that divide the number: " + countDigitsThatDivideNum(num3)); // Output: 4
    }
}
