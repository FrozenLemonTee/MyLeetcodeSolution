package Topics.Other.minimumAverage;

import java.util.Arrays;

public class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int l =0;
        int r = nums.length - 1;
        double min = Double.MAX_VALUE;
        while (l < r) {
            min = Math.min(min, (nums[l] + nums[r]) / 2.0);
            l += 1;
            r -= 1;
        }
        return min;
    }
}
