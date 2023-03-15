package Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode_15_3Sum_TwoPointer {
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums.length == 3 && nums[0] + nums[1] + nums[2] != 0) return new ArrayList<List<Integer>>();

        List<List<Integer>> res = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        if (nums[0] + nums[1] + nums[2] == 0 && nums.length == 3) {
            List<Integer> l = Arrays.asList(nums[0], nums[1], nums[2]);
            res.add(l);
            return res;
        }

        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int l = i + 1, r = nums.length - 1;
            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if (sum < 0) {
                    l++;
                } else if (sum > 0) {
                    r--;
                } else {
                    List<Integer> temp = Arrays.asList(nums[i], nums[l], nums[r]);
                    res.add(temp);
                    l++;
                    while (l < nums.length - 1 && nums[l] == nums[l - 1]) {
                        l++;
                    }
                }
            }
        }

        return res;
    }
}
