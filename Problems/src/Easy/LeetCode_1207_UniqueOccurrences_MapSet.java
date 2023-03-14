package Easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LeetCode_1207_UniqueOccurrences_MapSet {
    public boolean uniqueOccurrences(int[] arr) {
        if (arr.length == 1) return true;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            if (!map.containsKey(i)) {
                map.put(i, 1);
            } else {
                map.put(i , map.get(i) + 1);
            }
        }

        Set<Integer> set = new HashSet<>();
        for(Map.Entry<Integer, Integer> mSet : map.entrySet()) {
            if (set.contains(mSet.getValue())) {
                return false;
            } else {
                set.add(mSet.getValue());
            }
        }
        return true;
    }
}
