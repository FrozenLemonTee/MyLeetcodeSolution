package numberGame;


import java.util.Arrays;

public class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int i_tmp = 0;
        int i_res = 0;
        int[] tmp = new int[2];
        int[] res = new int[nums.length];
        while (i_tmp < nums.length) {
            tmp[i_tmp % 2] = nums[i_tmp];
            if (i_tmp % 2 != 0) {
                res[i_res] = tmp[i_tmp % 2];
                res[i_res + 1] = tmp[(i_tmp + 1) % 2];
                i_res += 2;
            }
            i_tmp += 1;
        }
        return res;
    }
}
