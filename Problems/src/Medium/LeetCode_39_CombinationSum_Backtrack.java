package Medium;

import java.util.*;

public class LeetCode_39_CombinationSum_Backtrack {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        if (candidates.length == 1 && target < candidates[0]) return new ArrayList<List<Integer>>();
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        LinkedList<Integer> temp = new LinkedList<>();
        backtrack(res, temp, candidates, target, 0);
        return res;
    }

    private void backtrack(List<List<Integer>> res, LinkedList<Integer> list, int[] candidates, int remain, int index) {
        if (remain == 0) {
            res.add(new ArrayList<Integer>(list));
            return;
        } else if (remain < 0) {
            return;
        }


        for (int i = index; i < candidates.length; i++) {
            list.add(candidates[i]);
            backtrack(res, list, candidates, remain - candidates[i], i);
            list.removeLast();
        }

    }
}
