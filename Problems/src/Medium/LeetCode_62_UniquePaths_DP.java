package Medium;

public class LeetCode_62_UniquePaths_DP {
    public int uniquePaths(int m, int n) {
        if (m == 1 && n == 1) return 1;

        int[][] grid = new int[m][n];
        for (int r = m - 1; r >= 0; r--) {
            for (int c = n - 1; c >= 0; c--) {
                if (r + 1 >= m || c + 1 >= n) {
                    grid[r][c] = 1;
                } else {
                    grid[r][c] = grid[r + 1][c] + grid[r][c + 1];
                }
            }
        }
        return grid[0][0];
    }
}
