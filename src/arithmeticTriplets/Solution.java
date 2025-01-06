package arithmeticTriplets;

public class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[j] - nums[i] == diff && nums[k] - nums[j] == diff)
                        count++;
                }
            }
        }
        return count;
    }

    public int arithmeticTriplets2(int[] nums, int diff) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] - nums[i] > diff) break;
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[k] - nums[j] > diff) break;
                    if (nums[j] - nums[i] == diff && nums[k] - nums[j] == diff)
                        count++;
                }
            }
        }
        return count;
    }

    public int arithmeticTriplets3(int[] nums, int diff) {
        int[] diffs = new int[nums.length - 1];
        for (int i = 0; i < nums.length - 1; i++) {
            diffs[i] = nums[i + 1] - nums[i];
        }
        int count = 0;
        jump:
        for (int l_start = 0; l_start < diffs.length; l_start++) {
            int l_end = l_start;
            int diff1 = 0;
            while (l_end < diffs.length) {
                diff1 += diffs[l_end];
                if (diff1 == diff) {
                    break;
                }
                if (diff1 > diff) {
                    continue jump;
                }
                l_end ++;
            }
            for (int r_start = l_end + 1; r_start < diffs.length; r_start++) {
                int r_end = r_start;
                int diff2 = 0;
                while (r_end < diffs.length) {
                    diff2 += diffs[r_end];
                    if (diff2 >= diff){
                        if (diff2 == diff) count ++;
                        continue jump;
                    }
                    r_end ++;
                }
            }
        }
        return count;
    }
}
