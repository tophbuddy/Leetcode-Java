package Medium;

public class LeetCode_11_ContainerMostWater_TwoPointer {
    public int maxArea(int[] height) {
        if (height.length == 0 || height.length == 1) return 0;
        if (height.length == 2) return Math.min(height[0], height[1]);
        int l = 0, r = height.length - 1, max = 0;

        while (l < r) {
            int area = (r - l) * Math.min(height[l], height[r]);
            max = Math.max(max, area);
            if (height[r] < height[l]) {
                r--;
            } else {
                l++;
            }
        }

        return max;
    }
}
