package Medium;

import java.util.*;

public class LeetCode_49_GroupAnagrams_HashMap {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 1) return new ArrayList<List<String>>(List.of(List.of(strs[0])));

        List<List<String>> res = new ArrayList<List<String>>();
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String key = new String(c);
            if (!(map.containsKey(key))) {
                map.put(key, new ArrayList<>(List.of(s)));
            } else {
                map.get(key).add(s);
            }
        }

        res.addAll(map.values());
        return res;
    }
}
