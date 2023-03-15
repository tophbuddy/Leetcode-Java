package Medium;

import java.util.List;

public class LeetCode_139_WordBreak_DP {
    public boolean wordBreak(String s, List<String> wordDict) {
        if (s.length() == 1 && wordDict.size() == 1 && wordDict.get(0).equals(s)) {
            return true;
        }

        boolean[] dp = new boolean[s.length() + 1];
        dp[s.length()] = true;
        for (int i = s.length(); i >= 0; i--) {
            for (String w : wordDict) {
                if (i + w.length() <= s.length() && s.substring(i, i + w.length()).equals(w)) {
                    dp[i] = dp[i + w.length()];
                }
                if (dp[i]) break;
            }
        }

        return dp[0];
    }
}
