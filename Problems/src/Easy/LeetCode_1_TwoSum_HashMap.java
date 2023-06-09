package Easy;

import java.util.HashMap;
import java.util.Map;

public class LeetCode_1_TwoSum_HashMap {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int j = 0; j < nums.length; j++) {
            int dif = target - nums[j];
            if (map.containsKey(dif) && map.get(dif) != j) {
                return new int[] {j, map.get(dif)};
            }
        }
        return new int[2];
    }
}
