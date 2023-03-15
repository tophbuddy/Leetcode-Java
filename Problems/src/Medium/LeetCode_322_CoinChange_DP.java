package Medium;

import java.util.Arrays;

public class LeetCode_322_CoinChange_DP {
    public int coinChange(int[] coins, int amount) {
        if (coins.length == 1 && coins[0] == amount) return 1;
        if (amount == 0) return 0;

        int[] dp = new int[amount + 1];
        int max = amount + 1;

        Arrays.fill(dp , max);
        dp[0] = 0;

        for (int i = 1; i < max; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (coins[j] <= i) {
                    dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
                }
            }
        }

        return dp[amount] > amount ? -1 : dp[amount];
    }
}
