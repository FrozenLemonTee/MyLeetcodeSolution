package Topics.Other.maxIncreaseKeepingSkyline;

public class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        final int N = grid.length;
        int[][] max_height = new int[N][2];
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                max_height[i][0] = Math.max(max_height[i][0], grid[i][j]);
                max_height[i][1] = Math.max(max_height[i][1], grid[j][i]);
            }
        }
        int res = 0;
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                final int MIN_HEIGHT = Math.min(max_height[i][0], max_height[j][1]);
                res += Math.max(0, MIN_HEIGHT - grid[i][j]);
            }
        }
        return res;
    }
}
