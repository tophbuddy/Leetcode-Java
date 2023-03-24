package Medium;

import java.util.*;

public class LeetCode_22_GenerateParenthesis_Backtrack {
    public List<String> generateParenthesis(int n) {
        if (n == 1) return new ArrayList<>(List.of("()"));

        List<String> res = new ArrayList<>();
        backtrack(res, "", 0, 0, n);
        return res;
    }

    private void backtrack(List<String> res, String s, int numOpen, int numClose, int n) {
        if (numOpen == n && numClose == n) {
            res.add(s);
            return;
        }
        if (numOpen > numClose) {
            backtrack(res, s + ")", numOpen, numClose + 1, n);
        }
        if (numOpen < n) {
            backtrack(res, s + "(", numOpen + 1, numClose, n);
        }
    }
}
