public class PrimeSetBitsCounter {

    // Method to count the numbers with a prime number of set bits
    public static int countPrimeSetBits(int left, int right) {
        int count = 0;

        for (int i = left; i <= right; i++) {
            int setBits = Integer.bitCount(i);
            if (isPrime(setBits)) {
                count++;
            }
        }

        return count;
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num == 2 || num == 3) return true;
        if (num % 2 == 0 || num % 3 == 0) return false;
        
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        int left = 6;
        int right = 10;

        int result = countPrimeSetBits(left, right);
        System.out.println("Output: " + result); // Output: 4

        // Another example
        left = 10;
        right = 15;
        result = countPrimeSetBits(left, right);
        System.out.println("Output: " + result); // Output: 5
    }
}
