package Topics.Other.countPoints;

public class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        final int n = queries.length;
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            for (int[] point : points) {
                int dis = (int) Math.pow(point[0] - queries[i][0], 2)
                        + (int) Math.pow(point[1] - queries[i][1], 2);
                if (dis <= (int) Math.pow(queries[i][2], 2)) {
                    res[i] += 1;
                }
            }
        }
        return res;
    }
}
