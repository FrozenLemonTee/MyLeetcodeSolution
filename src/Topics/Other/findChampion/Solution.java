package Topics.Other.findChampion;

public class Solution {
    public int findChampion(int[][] grid) {
        int cur = 0;
        for (int i = 1; i < grid[0].length; i++) {
            if (grid[cur][i] == 0) cur = i;
        }
        return cur;
    }
}
