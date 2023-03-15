package Medium;

public class LeetCode_200_NumOfIslands_DFS {
    int ROWS;
    int COLS;

    public int numIslands(char[][] grid) {
        ROWS = grid.length;
        COLS = grid[0].length;
        int numIslands = 0;

        for (int r = 0; r < ROWS; r++) {
            for (int c = 0; c < COLS; c++) {
                if (grid[r][c] == '1') {
                    dfs(r, c, grid);
                    numIslands++;
                }
            }
        }
        return numIslands;
    }

    private void dfs(int r, int c, char[][] map) {
        if (r < 0 || r >= ROWS || c < 0 || c >= COLS || map[r][c] == '0') {
            return;
        }

        map[r][c] = '0';
        dfs(r + 1, c, map);
        dfs(r - 1, c, map);
        dfs(r, c + 1, map);
        dfs(r, c - 1, map);
    }
}
