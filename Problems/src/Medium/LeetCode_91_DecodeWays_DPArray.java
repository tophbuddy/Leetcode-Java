package Medium;

public class LeetCode_91_DecodeWays_DPArray {
    public int numDecodings(String s) {
        if (s.charAt(0) == '0')
            return 0;
        if (s.length() == 1)
            return 1;

        int n = s.length();
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;

        for(int i = 1; i < n; i++) {
            if (s.charAt(i) != '0') {
                dp[i + 1] += dp[i];
            }

            int tDigit = Integer.parseInt(s.substring(i - 1, i + 1));
            if (tDigit >= 10 && tDigit <= 26) {
                dp[i + 1] += dp[i - 1];
            }
        }
        return dp[n];
    }
}
