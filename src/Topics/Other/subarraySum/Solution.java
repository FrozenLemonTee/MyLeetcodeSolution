package Topics.Other.subarraySum;

public class Solution {
    public int subarraySum(int[] nums) {
        final int length = nums.length;
        int cur_sum = 0;
        for (int i = 0; i < length; i++) {
            cur_sum += partialSum(nums, Math.max(0, i - nums[i]), i);
        }
        return cur_sum;
    }

    public int subarraySum2(int[] nums) {
        final int length = nums.length;
        int cur_sum = 0;
        int[] sums = new int[length];
        for (int i = 0; i < length; i++) {
            cur_sum += nums[i];
            sums[i] = cur_sum;
        }
        cur_sum = 0;
        for (int i = 0; i < length; i++) {
            final int start = Math.max(0, i - nums[i]);
            if (start == 0){
                cur_sum += sums[i];
            } else {
                cur_sum += (sums[i] - sums[start - 1]);
            }
        }
        return cur_sum;
    }

    // [start, end]
    public int partialSum(int[] nums, int start, int end){
        final int length = nums.length;
        int sum = 0;
        for (int i = start; i <= end && i < length; i++) {
            sum += nums[i];
        }
        return sum;
    }
}
