package Topics.SlidingWindow.maxSum;

import java.util.HashMap;
import java.util.List;

public class Solution {
    public long maxSum(List<Integer> nums, int m, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        long[] init = this.initSum(nums, m, k, hm);
        long cur_sum = init[1];
        long max_sum = init[0];
        for (int end = k; end < nums.size(); end++) {
            if (!hm.containsKey(nums.get(end))){
                hm.put(nums.get(end), 1);
            }else {
                hm.put(nums.get(end), hm.get(nums.get(end)) + 1);
            }
            cur_sum += nums.get(end);
            if (hm.get(nums.get(end - k)) == 1){
                hm.remove(nums.get(end - k));
            } else {
                hm.put(nums.get(end - k), hm.get(nums.get(end - k)) - 1);
            }
            cur_sum -= nums.get(end - k);
            if (hm.size() >= m)
                max_sum = Math.max(max_sum, cur_sum);
        }
        return max_sum;
    }

    public long[] initSum(List<Integer> nums, int m, int k, HashMap<Integer, Integer> hm) {
        long max_sum = 0;
        long cur_sum = 0;
        for (int i = 0; i < k; i++) {
            cur_sum += (long)nums.get(i);
            if (!hm.containsKey(nums.get(i))){
                hm.put(nums.get(i), 1);
            }else {
                hm.put(nums.get(i), hm.get(nums.get(i)) + 1);
            }
        }
        max_sum = hm.size() >= m ? cur_sum : max_sum;
        return new long[]{max_sum, cur_sum};
    }
}
