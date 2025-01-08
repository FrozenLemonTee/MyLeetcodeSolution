package Topics.Other.removeElement;

public class Solution {
    public int removeElement(int[] nums, int val) {
        if (nums.length == 0 || val > 50) {
            return nums.length;
        }
        int[] map = new int[51];
        for (int num : nums) {
            map[num] += 1;
        }
        int count = nums.length - map[val];
        int cur_write = 0;
        int map_idx = 0;
        int nums_idx = 0;
        while (nums_idx < count) {
            if (cur_write < map[map_idx] && map_idx != val) {
                nums[nums_idx] = map_idx;
                cur_write += 1;
                nums_idx += 1;
            }else {
                cur_write = 0;
                map_idx += 1;
            }
        }
        if (nums_idx <= nums.length - 1) {
            nums[nums_idx] = val;
        }
        return count;
    }

    public int removeElement2(int[] nums, int val) {
        int slow = 0, fast = 0;
        int res = 0;
        while (fast < nums.length) {
            if (nums[fast] != val) {
                nums[slow] = nums[fast];
                slow += 1;
                fast += 1;
            }else {
                fast += 1;
                res += 1;
            }
        }
        return nums.length - res;
    }
}
