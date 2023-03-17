package Medium;

import java.util.*;

public class LeetCode_91_DecodeWays_DP_DFS {
    Map<Integer, Integer> decodeMap = new HashMap<>();

    public int numDecodings(String s) {
        if (s.length() == 1) return s.charAt(0) == '0' ? 0 : 1;

        decodeMap.put(s.length(), 1);
        return dfs(0, s);
    }

    private int dfs(int index, String s) {
        if (decodeMap.containsKey(index)) return decodeMap.get(index);
        if (s.charAt(index) == '0') return 0;
        int res = dfs(index + 1, s);
        if (index + 1 < s.length() && (s.charAt(index) == '1' || s.charAt(index) == '2' && "0123456".contains(String.valueOf(s.charAt(index + 1))))) {
            res += dfs(index + 2, s);
        }
        decodeMap.put(index, res);
        return res;
    }
}
