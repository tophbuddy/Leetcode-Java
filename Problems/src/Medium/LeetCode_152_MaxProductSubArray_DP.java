package Medium;

public class LeetCode_152_MaxProductSubArray_DP {
    public int maxProduct(int[] nums) {
        if (nums.length == 1) return nums[0];
        if (nums.length == 2) return Math.max(nums[0] * nums[1], Math.max(nums[0], nums[1]));

        int curMax = nums[0], curMin = nums[0];
        int res = curMax;

        for (int i = 1; i < nums.length; i++) {
            int tempMax = Math.max(nums[i], Math.max(nums[i] * curMax, nums[i] * curMin));
            curMin = Math.min(nums[i], Math.min(nums[i] * curMin, nums[i] * curMax));
            curMax = tempMax;
            res = Math.max(res, curMax);
        }

        return res;
    }
}
