package Easy;

import java.util.*;

public class LeetCode_13_RomanToInt_HashMap {
    HashMap<Character, Integer> romanMap = new HashMap<>() {{
        put('I', 1);
        put('V', 5);
        put('X', 10);
        put('L', 50);
        put('C', 100);
        put('D', 500);
        put('M', 1000);
    }};
    public int romanToInt(String s) {
        if (s.length() == 1) return romanMap.get(s.charAt(0));

        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1 && romanMap.get(s.charAt(i)) < romanMap.get(s.charAt(i + 1))) {
                res -= romanMap.get(s.charAt(i));
            } else {
                res += romanMap.get(s.charAt(i));
            }

        }
        return res;
    }
}
