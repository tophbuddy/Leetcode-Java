package Medium;

import java.util.*;

public class LeetCode_380_InsertDeleteGetRandom_HashMap {
    class RandomizedSet {
        Random random = new Random();
        List<Integer> list;
        Map<Integer, Integer> map;

        public RandomizedSet() {
            list = new ArrayList<>();
            map = new HashMap<>();
        }

        public boolean insert(int val) {
            Integer get = map.get(val);
            if (get == null) {
                map.put(val, list.size());
                list.add(list.size(), val);
                return true;
            }
            return false;
        }

        public boolean remove(int val) {
            Integer idx = map.get(val);
            if (idx == null) {
                return false;
            }
            int endVal = list.get(list.size() - 1);
            list.set(idx, endVal);
            map.put(endVal, idx);
            list.remove((list.size() - 1));
            map.remove(val);
            return true;
        }

        public int getRandom() {
            int i = random.nextInt(list.size());
            return list.get(i);
        }
    }
}
