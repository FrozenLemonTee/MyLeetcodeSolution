package Topics.Other.diagonalSum;

public class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        for (int i = 0; i < mat[0].length; i++) {
            sum += mat[i][i];
        }
        for (int i = 0; i < mat[0].length; i++) {
            if (i != mat[0].length - 1 - i) {
                sum += mat[i][mat[0].length - 1 - i];
            }
        }
        return sum;
    }
}
