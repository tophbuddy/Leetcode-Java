package Medium;

public class LeetCode_53_MaxSubarray_DP {
    public int maxSubArray(int[] nums) {
        if (nums.length == 1) return nums[0];
        if (nums.length == 2) return Math.max(nums[0] + nums[1], Math.max(nums[0], nums[1]));

        int curSum = nums[0], maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            curSum = Math.max(nums[i], nums[i] + curSum);
            maxSum = Math.max(maxSum, curSum);
        }

        return maxSum;
    }
}
