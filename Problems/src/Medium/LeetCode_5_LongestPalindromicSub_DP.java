package Medium;

public class LeetCode_5_LongestPalindromicSub_DP {
    public String longestPalindrome(String s) {
        if (s.length() == 1) return s;

        int maxLen = 0;
        String res = "";

        int left, right;
        for (int i = 0; i < s.length(); i++) {
            left = right = i;
            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                if (maxLen < right - left + 1) {
                    maxLen = right - left + 1;
                    res = s.substring(left, right + 1);
                }
                left--;
                right++;
            }

            left = i;
            right = i + 1;
            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                if (maxLen < right - left + 1) {
                    maxLen = right - left + 1;
                    res = s.substring(left, right + 1);
                }
                left--;
                right++;
            }
        }

        return res;
    }
}
