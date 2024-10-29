package findIntersectionValues;

import java.util.HashMap;

public class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();
        for (int k : nums1) {
            if (!map1.containsKey(k)) {
                map1.put(k, 1);
            } else {
                map1.put(k, map1.get(k) + 1);
            }
        }
        for (int j : nums2) {
            if (!map2.containsKey(j)) {
                map2.put(j, 1);
            } else {
                map2.put(j, map2.get(j) + 1);
            }
        }
        int[] res = new int[2];
        for (int n1 : map1.keySet()){
            if (map2.containsKey(n1)){
                res[0] += map1.get(n1);
            }
        }
        for (int n2 : map2.keySet()){
            if (map1.containsKey(n2)){
                res[1] += map2.get(n2);
            }
        }
        return res;
    }

    public int[] findIntersectionValues2(int[] nums1, int[] nums2) {
        int[][] map = new int[2][100];
        for (int j : nums1) {
            map[0][j - 1]++;
        }
        for (int j : nums2) {
            map[1][j - 1]++;
        }
        int[] res = new int[2];
        for (int i = 0; i < 100; i++) {
            if (map[0][i] > 0 && map[1][i] > 0) {
                res[0] += map[0][i];
                res[1] += map[1][i];
            }
        }
        return res;
    }
}
