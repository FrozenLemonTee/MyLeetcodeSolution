package getSneakyNumbers;

import java.util.HashMap;

public class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] result = new int[2];
        int index = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                result[index] = num;
                index += 1;
            }
            if (index == 2) {
                return result;
            }
        }
        return result;
    }

    public int[] getSneakyNumbers2(int[] nums) {
        int[] flag = new int[nums.length - 2];
        int[] result = new int[2];
        int index = 0;
        for (int num : nums) {
            if (flag[num] == 0) {
                flag[num] = 1;
            } else {
                result[index] = num;
                index += 1;
            }
            if (index == 2) {
                return result;
            }
        }
        return result;
    }
}
