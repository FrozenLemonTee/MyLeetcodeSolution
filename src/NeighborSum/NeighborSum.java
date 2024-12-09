package NeighborSum;


/**
 * Your NeighborSum object will be instantiated and called as such:
 * NeighborSum obj = new NeighborSum(grid);
 * int param_1 = obj.adjacentSum(value);
 * int param_2 = obj.diagonalSum(value);
 */
public class NeighborSum {
    int[][] grid;
    public NeighborSum(int[][] grid) {
        this.grid = grid.clone();
    }

    public int[] indexOf(int value) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == value) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }

    public int adjacentSum(int value) {
        int[] indexes = indexOf(value);
        int i = indexes[0];
        int j = indexes[1];
        int sum = 0;
        if (i >= 1){
            sum += this.grid[i - 1][j];
        }
        if (j >= 1){
            sum += this.grid[i][j - 1];
        }
        if (i < grid.length - 1){
            sum += this.grid[i + 1][j];
        }
        if (j < grid[0].length - 1){
            sum += this.grid[i][j + 1];
        }
        return sum;
    }

    public int diagonalSum(int value) {
        int[] indexes = indexOf(value);
        int i = indexes[0];
        int j = indexes[1];
        int sum = 0;
        if (i >= 1 && j >= 1){
            sum += this.grid[i - 1][j - 1];
        }
        if (i < grid.length - 1 && j < grid[0].length - 1){
            sum += this.grid[i + 1][j + 1];
        }
        if (i >= 1 && j < grid[0].length - 1){
            sum += this.grid[i - 1][j + 1];
        }
        if (i < grid.length - 1 && j >= 1){
            sum += this.grid[i + 1][j - 1];
        }
        return sum;
    }
}
