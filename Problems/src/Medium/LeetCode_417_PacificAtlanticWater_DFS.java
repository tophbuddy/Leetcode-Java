package Medium;

import java.util.*;

public class LeetCode_417_PacificAtlanticWater_DFS {
    int ROWS;
    int COLS;
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        Set<List<Integer>> pac = new HashSet<>();
        Set<List<Integer>> atl = new HashSet<>();
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        ROWS = heights.length;
        COLS = heights[0].length;

        for (int c = 0; c < COLS; c++) {
            dfs(pac, heights, 0, c, heights[0][c]);
            dfs(atl, heights, ROWS - 1, c, heights[ROWS - 1][c]);
        }

        for (int r = 0; r < ROWS; r++) {
            dfs(pac, heights, r, 0, heights[r][0]);
            dfs(atl, heights, r, COLS - 1, heights[r][COLS - 1]);
        }

        pac.retainAll(atl);
        res.addAll(pac);
        return res;
    }

    private void dfs(Set<List<Integer>> set, int[][] heights, int r, int c, int prevHeight) {
        List<Integer> curCell = Arrays.asList(r, c);
        if (set.contains(curCell) || r == ROWS || r < 0 || c == COLS || c < 0 || heights[r][c] < prevHeight) {
            return;
        }
        set.add(curCell);
        dfs(set, heights, r + 1, c, heights[r][c]);
        dfs(set, heights, r - 1, c, heights[r][c]);
        dfs(set, heights, r, c + 1, heights[r][c]);
        dfs(set, heights, r, c - 1, heights[r][c]);
    }
}
