package Medium;

public class LeetCode_48_RotateImage_MatrixSim {
    public void rotate(int[][] matrix) {
        int l = 0, r = matrix.length - 1;
        while (l < r) {
            int top = l, bottom = r;
            for (int i = 0; i < r - l; i++) {
                int topLeft = matrix[top][l + i];
                matrix[top][l + i] = matrix[bottom - i][l];
                matrix[bottom - i][l] = matrix[bottom][r - i];
                matrix[bottom][r - i] = matrix[top + i][r];
                matrix[top + i][r] = topLeft;
            }
            l++;
            r--;
        }
    }
}
