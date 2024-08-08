public class ElementDigitSumDifference {

    public static int differenceOfSums(int[] nums) {
        int elementSum = 0;
        int digitSum = 0;

        for (int num : nums) {
            elementSum += num;
            digitSum += sumOfDigits(num);
        }

        return Math.abs(elementSum - digitSum);
    }

    private static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 15, 6, 3};
        int[] nums2 = {1, 2, 3, 4};

        System.out.println("Output for nums1: " + differenceOfSums(nums1)); // Output: 9
        System.out.println("Output for nums2: " + differenceOfSums(nums2)); // Output: 0
    }
}
