package Medium;

import java.util.Arrays;

public class LeetCode_300_LongestIncreasingSubseq_DP {
    public int lengthOfLIS(int[] nums) {
        if (nums.length == 1) return 1;
        if (nums.length == 2) {
            return nums[0] < nums[1] ? 2 : 1;
        }

        int[] dp = new int[nums.length];
        int max = 1;
        Arrays.fill(dp, 1);

        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                    max = Math.max(max, dp[i]);
                }
            }
        }

        return max;
    }
}
