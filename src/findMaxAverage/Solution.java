package findMaxAverage;

public class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double res;
        double avg = 0;
        int l = 0;
        int r = 0;
        while (r < k){
            avg += nums[r];
            r += 1;
        }
        avg = avg / k;
        res = avg;
        while (r < nums.length){
            avg += (double) (nums[r] - nums[l]) / k;
            l += 1;
            r += 1;
            res = Math.max(res, avg);
        }
        return res;
    }
}
