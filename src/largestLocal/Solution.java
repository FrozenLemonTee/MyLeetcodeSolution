package largestLocal;

public class Solution {
    public int[][] largestLocal(int[][] grid) {
        int[][] res = new int[grid.length - 2][grid[0].length - 2];
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                res[i][j] = maxPool(grid, i + 1, j + 1);
            }
        }
        return res;
    }

    public int maxPool(int[][] grid, int i, int j) {
        int max = Integer.MIN_VALUE;
        for (int m = i - 1; m <= i + 1; m++) {
            for (int n = j - 1; n <= j + 1; n++) {
                max = Math.max(max, grid[m][n]);
            }
        }
        return max;
    }
}
