package Topics.Other.minCosts;

public class Solution {
    public int[] minCosts(int[] cost) {
        final int length  = cost.length;
        int[] res = new int[length];
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < length; i++) {
            min = Math.min(min, cost[i]);
            res[i] = min;
        }
        return res;
    }
}
