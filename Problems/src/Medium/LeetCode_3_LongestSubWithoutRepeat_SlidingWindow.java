package Medium;

import java.util.*;

public class LeetCode_3_LongestSubWithoutRepeat_SlidingWindow {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;
        if (s.length() == 1 || s.length() == 2 && s.charAt(0) == s.charAt(1)) return 1;

        Set<Character> set = new HashSet<>();
        int l = 0, res = 0;

        for (int r = 0; r < s.length(); r++) {
            while (set.contains(s.charAt(r))) {
                set.remove(s.charAt(l));
                l++;
            }
            set.add(s.charAt(r));
            res = Math.max(res, r - l + 1);
        }
        return res;
    }
}
