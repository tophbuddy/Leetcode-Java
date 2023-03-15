package Medium;

public class LeetCode_198_HouseRobber_DP {
    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];
        if (nums.length == 2) return nums[0] <= nums[1] ? nums[1] : nums[0];

        int[] dp = new int[nums.length + 1];
        dp[0] = 0;
        dp[1] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (i < nums.length) {
                dp[i + 1] = Math.max(dp[i], dp[i - 1] + nums[i]);
            }
        }

        return dp[nums.length];
    }
}
