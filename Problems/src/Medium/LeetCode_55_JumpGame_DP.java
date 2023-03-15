package Medium;

public class LeetCode_55_JumpGame_DP {
    public boolean canJump(int[] nums) {
        if (nums.length == 1) return true;
        if (nums.length > 1 && nums[0] == 0) return false;

        int goal = nums.length - 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] + i >= goal) {
                goal = i;
            }
        }
        return goal == 0;
    }
}
