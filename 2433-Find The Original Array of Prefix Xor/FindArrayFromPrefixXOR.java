public class FindArrayFromPrefixXOR {

    public static int[] findArray(int[] pref) {
        int n = pref.length;
        int[] arr = new int[n];
        
        // The first element of arr is the same as the first element of pref
        arr[0] = pref[0];
        
        // For the rest of the elements, we can find arr[i] by XORing pref[i] with pref[i - 1]
        for (int i = 1; i < n; i++) {
            arr[i] = pref[i] ^ pref[i - 1];
        }
        
        return arr;
    }

    public static void main(String[] args) {
        // Example 1
        int[] pref1 = {5, 2, 0, 3, 1};
        int[] arr1 = findArray(pref1);
        System.out.print("Output for pref1: ");
        for (int num : arr1) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Example 2
        int[] pref2 = {13};
        int[] arr2 = findArray(pref2);
        System.out.print("Output for pref2: ");
        for (int num : arr2) {
            System.out.print(num + " ");
        }
    }
}
