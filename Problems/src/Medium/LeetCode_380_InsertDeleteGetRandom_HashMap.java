package Medium;

import java.util.*;

public class LeetCode_380_InsertDeleteGetRandom_HashMap {
    class RandomizedSet {
        Map<Integer, Integer> mapSet;
        List<Integer> listSet;
        Random rand = new Random();

        public RandomizedSet() {
            mapSet = new HashMap<>();
            listSet = new ArrayList<>();
        }

        public boolean insert(int val) {
            if (mapSet.containsKey(val)) {
                return false;
            }
            mapSet.put(val, listSet.size());
            listSet.add(listSet.size(), val);
            return true;
        }

        public boolean remove(int val) {
            if (!mapSet.containsKey(val)) {
                return false;
            }
            int valIndex = mapSet.get(val);
            int endVal = listSet.get(listSet.size() - 1);
            listSet.set(valIndex, endVal);
            mapSet.put(endVal, valIndex);
            listSet.remove(listSet.size() - 1);
            mapSet.remove(val);

            return true;
        }

        public int getRandom() {
            int max = listSet.size();
            int r = rand.nextInt(max);
            return listSet.get(r);
        }
    }
}
