package countSubarrays;

public class Solution {
    public int countSubarrays(int[] nums) {
        int count = 0;
        int end = 3;
        double sum = initSum(nums, end);
        if (sum - nums[end / 2] == (double) nums[end / 2] / 2) {
            count += 1;
        }
        for (int i = 2; i < nums.length - 1; i++) {
            sum += (nums[i + 1] - nums[i - 2]);
            if (sum - nums[i] == (double) nums[i] / 2){
                count += 1;
            }
        }
        return count;
    }

    public double initSum(int[] nums, int end) {
        int sum = 0;
        for (int i = 0; i < end; i++){
            sum += nums[i];
        }
        return sum;
    }
}
