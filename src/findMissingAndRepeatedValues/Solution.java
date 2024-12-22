package findMissingAndRepeatedValues;

import java.util.BitSet;

public class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int[] map = new int[n * n];
        for (int[] row : grid) {
            for (int element : row) {
                map[element - 1]++;
            }
        }
        int[] result = new int[2];
        for (int i = 0; i < map.length; i++) {
            if (map[i] == 2) {
                result[0] = i + 1;
            }else if (map[i] == 0) {
                result[1] = i + 1;
            }
        }
        return result;
    }

    public int[] findMissingAndRepeatedValues2(int[][] grid) {
        int n = grid.length;
        BitSet bitSet = new BitSet(n * n);
        int[] result = new int[2];
        for (int[] row : grid) {
            for (int element : row) {
                if (bitSet.get(element - 1)) {
                    result[0] = element;
                }else {
                    bitSet.set(element - 1);
                }
            }
        }
        for (int i = 0; i < n * n; i++) {
            if (!bitSet.get(i)) {
                result[1] = i + 1;
            }
        }
        return result;
    }
}
