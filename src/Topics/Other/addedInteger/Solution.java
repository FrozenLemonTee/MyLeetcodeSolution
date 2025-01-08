package Topics.Other.addedInteger;

import java.util.Arrays;

public class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        return nums2[0] - nums1[0];
    }

    public int addedInteger2(int[] nums1, int[] nums2) {
        return min(nums2) - min(nums1);
    }

    public static int min(int[] nums) {
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            min = Math.min(min, num);
        }
        return min;
    }
}
