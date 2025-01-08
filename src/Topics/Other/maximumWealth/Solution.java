package Topics.Other.maximumWealth;

import java.util.Arrays;

public class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for (int[] account : accounts) {
            maxWealth = Math.max(maxWealth, Arrays.stream(account).sum());
        }
        return maxWealth;
    }

    public int maximumWealth2(int[][] accounts) {
        int maxWealth = 0;
        for (int[] account : accounts) {
            int currentWealth = 0;
            for (int i : account) {
                currentWealth += i;
            }
            maxWealth = Math.max(maxWealth, currentWealth);
        }
        return maxWealth;
    }
}
