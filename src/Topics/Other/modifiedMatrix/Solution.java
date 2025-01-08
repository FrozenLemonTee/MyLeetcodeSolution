package Topics.Other.modifiedMatrix;

public class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        int[][] res = matrix.clone();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == -1){
                    matrix[i][j] = rowMax(matrix, j);
                }
            }
        }
        return res;
    }

    static public int rowMax(int[][] matrix, int row) {
        int max = Integer.MIN_VALUE;
        for (int[] line : matrix) {
            max = Math.max(max, line[row]);
        }
        return max;
    }
}
