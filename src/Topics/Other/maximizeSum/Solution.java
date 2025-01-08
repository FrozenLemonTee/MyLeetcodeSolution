package Topics.Other.maximizeSum;


public class Solution {
    public int maximizeSum(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
        }
        return (2 * max + k - 1) *k / 2;
    }
}
