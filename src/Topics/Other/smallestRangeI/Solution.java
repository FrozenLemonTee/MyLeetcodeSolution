package Topics.Other.smallestRangeI;

import java.util.Arrays;

class Solution {
    public int smallestRangeI(int[] nums, int k) {
        if(nums.length == 1){
            return 0;
        }
        Arrays.sort(nums);
        return Math.max((nums[nums.length - 1] - nums[0] - 2 * k), 0);
    }
    public int smallestRangeI2(int[] nums, int k) {
        return Math.max((Arrays.stream(nums).max().orElse(0)
                - Arrays.stream(nums).min().orElse(0) - 2 * k), 0);
    }
}
