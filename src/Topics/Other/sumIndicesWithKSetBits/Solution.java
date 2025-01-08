package Topics.Other.sumIndicesWithKSetBits;

import java.util.List;

public class Solution {
    public boolean hasKSetBits(int num, int k) {
        int count = 0;
        int mask = 2;
        while (num > 0){
            if (count > k){
                return false;
            }
            if (num % mask != 0){
                count += 1;
            }
            num = num >> 1;
        }
        return count == k;
    }

    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum = 0;
        for (int i = 0; i < nums.size(); i++){
            if (this.hasKSetBits(i, k)){
                sum += nums.get(i);
            }
        }
        return sum;
    }

    public int sumIndicesWithKSetBits2(List<Integer> nums, int k) {
        int sum = 0;
        for (int i = 0; i < nums.size(); i++){
            if (Integer.bitCount(i) == k){
                sum += nums.get(i);
            }
        }
        return sum;
    }
}
