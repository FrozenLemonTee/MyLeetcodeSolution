package moveZeroes;

public class Solution {
    public void moveZeroes(int[] nums) {
        int prev = 0, last = 0;
        while (last < nums.length) {
            if (nums[last] != 0) {
                nums[prev] = nums[last];
                prev++;
            }
            last++;
        }
        while (prev < nums.length) {
            nums[prev] = 0;
            prev++;
        }
    }
}
