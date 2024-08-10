public class PivotInteger {
    public static int pivotInteger(int n) {
        int totalSum = n * (n + 1) / 2;
        int leftSum = 0;
        
        for (int x = 1; x <= n; x++) {
            leftSum += x;
            int rightSum = totalSum - leftSum + x; // Adjust right sum by including x
            if (leftSum == rightSum) {
                return x;
            }
        }
        
        return -1; // No pivot integer found
    }

    public static void main(String[] args) {
        int n1 = 8;
        int n2 = 1;
        int n3 = 4;

        System.out.println("Pivot Integer for n = " + n1 + ": " + pivotInteger(n1)); // Output: 6
        System.out.println("Pivot Integer for n = " + n2 + ": " + pivotInteger(n2)); // Output: 1
        System.out.println("Pivot Integer for n = " + n3 + ": " + pivotInteger(n3)); // Output: -1
    }
}
