
public class OddLengthSubarraySum {

    public static int sumOddLengthSubarrays(int[] arr) {
        int totalSum = 0;
        int n = arr.length;
        
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if ((j - i + 1) % 2 != 0) {
                    totalSum += sum;
                }
            }
        }
        
        return totalSum;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 4, 2, 5, 3};
        System.out.println(sumOddLengthSubarrays(arr1)); // Output: 58

        int[] arr2 = {1, 2};
        System.out.println(sumOddLengthSubarrays(arr2)); // Output: 3

        int[] arr3 = {10, 11, 12};
        System.out.println(sumOddLengthSubarrays(arr3)); // Output: 66
    }
}
