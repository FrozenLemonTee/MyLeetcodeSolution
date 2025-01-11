package Topics.SlidingWindow.maximumSubarraySum;

import java.util.HashMap;

public class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        long cur_sum = 0L;
        for (int i = 0; i < k; i++){
            if (!hm.containsKey(nums[i])){
                hm.put(nums[i], 1);
            }else {
                hm.put(nums[i], hm.get(nums[i]) + 1);
            }
            cur_sum += nums[i];
        }
        long max_sum = hm.size() == k ? cur_sum : 0;
        for (int i = k; i < nums.length; i++){
            cur_sum += (nums[i] - nums[i - k]);
            if (!hm.containsKey(nums[i])){
                hm.put(nums[i], 1);
            }else {
                hm.put(nums[i], hm.get(nums[i]) + 1);
            }
            if (hm.get(nums[i - k]) == 1){
                hm.remove(nums[i - k]);
            }else {
                hm.put(nums[i - k], hm.get(nums[i - k]) - 1);
            }
            max_sum = hm.size() == k ? Math.max(max_sum, cur_sum) : max_sum;
        }
        return max_sum;
    }
}
