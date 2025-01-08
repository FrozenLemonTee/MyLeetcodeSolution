package Topics.Other.subsetXORSum;


public class Solution {
    public int subsetXORSum(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum ^= num;
        }
        int cur_sum = sum;
        for (int i = 0; i < nums.length; i++) {
            sum += subsetXORSumRecur(nums, i + 1, cur_sum ^ nums[i]);
        }
        return sum;
    }

    public int subsetXORSumRecur(int[] nums, int start, int super_sum) {
        int sum = super_sum;
        for (int i = start; i < nums.length; i++) {
            sum += subsetXORSumRecur(nums, i + 1, super_sum ^ nums[i]);
        }
        return sum;
    }
}
