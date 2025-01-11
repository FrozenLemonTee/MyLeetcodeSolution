package numIdenticalPairs;

public class Solution {
    public int numIdenticalPairs(int[] nums) {
        int[] map = new int[100];
        for (int num : nums) {
            map[num - 1]++;
        }
        int res = 0;
        for (int cnt : map){
            if (cnt == 0) continue;
            res += (cnt - 1) * cnt / 2;
        }
        return res;
    }
}
