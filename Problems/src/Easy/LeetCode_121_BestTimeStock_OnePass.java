package Easy;

public class LeetCode_121_BestTimeStock_OnePass {
    public int maxProfit(int[] prices) {
        int max = 0, curMin = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if (curMin > prices[i]) {
                curMin = prices[i];
            } else if (max < prices[i] - curMin) {
                max = prices[i] - curMin;
            }
        }
        return max;
    }
}
