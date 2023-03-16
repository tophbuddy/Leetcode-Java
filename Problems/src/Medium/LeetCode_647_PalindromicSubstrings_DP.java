package Medium;

public class LeetCode_647_PalindromicSubstrings_DP {
    public int countSubstrings(String s) {
        if (s.length() == 1) return 1;

        int count = 0;
        int l, r;

        // if (s.length() % 2 != 0) {
        for (int i = 0; i < s.length(); i++) {
            l = r = i;
            while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                count++;
                r++;
                l--;
            }
        }
        // } else {
        for (int i = 0; i < s.length(); i++) {
            l = i;
            r = i + 1;
            while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                count++;
                r++;
                l--;
            }
        }
        // }

        return count;
    }
}
