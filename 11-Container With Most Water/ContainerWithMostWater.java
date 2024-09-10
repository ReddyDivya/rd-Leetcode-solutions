public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            // Calculate the width and height of the container
            int width = right - left;
            int minHeight = Math.min(height[left], height[right]);

            // Calculate the area of the container
            int currentArea = width * minHeight;
            maxArea = Math.max(maxArea, currentArea);

            // Move the pointer pointing to the shorter line
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }

    public static void main(String[] args) {
        ContainerWithMostWater container = new ContainerWithMostWater();
        int[] height1 = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int[] height2 = {1, 1};

        System.out.println("Max Area for height1: " + container.maxArea(height1)); // Output: 49
        System.out.println("Max Area for height2: " + container.maxArea(height2)); // Output: 1
    }
}
