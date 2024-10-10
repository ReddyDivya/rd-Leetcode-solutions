public class RectangleOverlap {

    public static boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        // Check if one rectangle is to the left of the other
        if (rec1[2] <= rec2[0] || rec2[2] <= rec1[0]) {
            return false;
        }
        // Check if one rectangle is above the other
        if (rec1[3] <= rec2[1] || rec2[3] <= rec1[1]) {
            return false;
        }
        // If neither condition is true, the rectangles overlap
        return true;
    }

    public static void main(String[] args) {
        int[] rec1 = {0, 0, 2, 2};
        int[] rec2 = {1, 1, 3, 3};
        System.out.println(isRectangleOverlap(rec1, rec2)); // Output: true

        int[] rec3 = {0, 0, 1, 1};
        int[] rec4 = {1, 0, 2, 1};
        System.out.println(isRectangleOverlap(rec3, rec4)); // Output: false

        int[] rec5 = {0, 0, 1, 1};
        int[] rec6 = {2, 2, 3, 3};
        System.out.println(isRectangleOverlap(rec5, rec6)); // Output: false
    }
}
