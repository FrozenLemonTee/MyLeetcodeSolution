package Topics.Other.distinctDifferenceArray;

import java.util.BitSet;

public class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        int[][] map = new int[50][2];
        int count_l = 0;
        int count_r = 0;
        int[] diff = new int[nums.length];
        for (int i = nums.length - 1; i >= 0; i--) {
            if (map[nums[i] - 1][1] == 0){
                count_r++;
            }
            map[nums[i] - 1][1] ++;
            diff[i] = count_r;
        }
        for (int i = 0; i < nums.length; i++) {
            if (map[nums[i] - 1][0] == 0){
                count_l++;
            }
            map[nums[i] - 1][0] ++;
            if (i != nums.length - 1){
                diff[i] = count_l - diff[i + 1];
            }else {
                diff[i] = count_l;
            }
        }
        return diff;
    }

    public int[] distinctDifferenceArray2(int[] nums) {
        BitSet map = new BitSet(50);
        int count_l = 0;
        int count_r = 0;
        int[] diff = new int[nums.length];
        for (int i = nums.length - 1; i >= 0; i--) {
            if (!map.get(nums[i] - 1)){
                count_r ++;
            }
            map.set(nums[i] - 1);
            diff[i] = count_r;
        }
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i] - 1)){
                count_l ++;
            }
            map.clear(nums[i] - 1);
            if (i != nums.length - 1){
                diff[i] = count_l - diff[i + 1];
            }else {
                diff[i] = count_l;
            }
        }
        return diff;
    }
}
