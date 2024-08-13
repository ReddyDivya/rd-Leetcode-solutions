public class BuildArrayFromPermutation {
    public static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums1 = {0, 2, 1, 5, 3, 4};
        int[] result1 = buildArray(nums1);
        System.out.print("Output 1: ");
        for (int num : result1) {
            System.out.print(num + " ");
        }
        System.out.println();

        int[] nums2 = {5, 0, 1, 2, 3, 4};
        int[] result2 = buildArray(nums2);
        System.out.print("Output 2: ");
        for (int num : result2) {
            System.out.print(num + " ");
        }
    }
}
