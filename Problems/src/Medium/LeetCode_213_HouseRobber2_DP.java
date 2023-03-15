package Medium;

import java.util.Arrays;

public class LeetCode_213_HouseRobber2_DP {
    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];
        int[] sub1 = Arrays.copyOfRange(nums, 1, nums.length);
        int[] sub2 = Arrays.copyOfRange(nums, 0, nums.length - 1);
        return Math.max(robHelp(sub1), robHelp(sub2));
    }

    private int robHelp(int[] arr) {
        int rob1 = 0, rob2 = 0;
        for (int i = 0; i < arr.length; i++) {
            int temp = Math.max(arr[i] + rob1, rob2);
            rob1 = rob2;
            rob2 = temp;
        }
        return rob2;
    }
}
