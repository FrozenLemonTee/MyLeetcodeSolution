package leftRightDifference;

public class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] left_sum = new int[nums.length];
        int[] right_sum = new int[nums.length];
        for (int i = 1; i < nums.length; i++) {
            if (i == 1) {
                left_sum[i] = nums[i - 1];
            }else {
                left_sum[i] = nums[i - 1] + left_sum[i - 1];
            }
        }
        for (int j = nums.length - 2; j >= 0; j--) {
            if (j == nums.length - 2) {
                right_sum[j] = nums[j + 1];
            }else {
                right_sum[j] = nums[j + 1] + right_sum[j + 1];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            left_sum[i] = Math.abs(left_sum[i] - right_sum[i]);
        }
        return left_sum;
    }

}
