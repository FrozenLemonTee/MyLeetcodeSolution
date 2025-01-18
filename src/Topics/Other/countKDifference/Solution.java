package Topics.Other.countKDifference;

import java.util.HashMap;

public class Solution {
    public int countKDifference(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (Math.abs(nums[i] - nums[j]) == k)
                    count ++;
            }
        }
        return count;
    }

    public int countKDifference2(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (!map.containsKey(num))
                map.put(num, 1);
            else
                map.put(num, map.get(num) + 1);
        }
        int count = 0;
        for (int num : map.keySet()) {
            if (map.containsKey(num - k))
                count += map.get(num) * map.get(num - k);
        }
        return count;
    }

}
