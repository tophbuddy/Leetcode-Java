package Medium;

import java.util.*;

public class LeetCode_347_TopKFrequent_PQ {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> map.get(a) - map.get(b));
        for (int key : map.keySet()) {
            pq.offer(key);
            if (pq.size() > k) pq.poll();
        }

        return pq.stream().mapToInt(x->x).toArray();
    }
}
