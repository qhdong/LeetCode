package P011.ContainerWithMostWater;

/*
Given n non-negative integers a1, a2, ..., an, where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines, which together with x-axis forms a container, such that the container contains the most water.

Note: You may not slant the container.
 */

public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        if (height == null || height.length == 0) {
            return 0;
        }

        int area = 0;
        for (int i = 0, j = height.length - 1; i < j;) {
            int h = Math.min(height[i], height[j]);
            area = Math.max(area, (j - i) * h);
            while (height[i] <= h && i < j) i++;
            while (height[j] <= h && i < j) j--;
        }

        return area;
    }

    public static void main(String[] args) {
        int[] height = new int[] {1, 2, 3, 4};
        System.out.println(maxArea(height));
    }
}
