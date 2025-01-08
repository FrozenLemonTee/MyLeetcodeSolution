package Topics.Other.deleteGreatestValue;

import java.util.Arrays;

public class Solution {
    public int deleteGreatestValue(int[][] grid) {
        for (int[] line : grid) {
            this.heapInit(line);
        }
        int res = 0;
        for (int range = grid[0].length; range > 0; range--) {
            int max = Integer.MIN_VALUE;
            for (int[] line : grid) {
                max = Math.max(max, this.heapPop(line, range));
            }
            res += max;
        }
        return res;
    }

    public void swap(int[] line, int i, int j) {
        int temp = line[i];
        line[i] = line[j];
        line[j] = temp;
    }

    public void heapInit(int[] line) {
        for (int i = line.length / 2 - 1; i >= 0; i--) {
            this.heapAdjustDown(line, i, line.length);
        }
    }

    public int heapPop(int[] line, int range) {
        this.swap(line, 0, range - 1);
        this.heapAdjustDown(line, 0, range - 1);
        return line[range - 1];
    }

    public int heapLeftIdx(int parent){
        return (parent + 1) * 2 - 1;
    }

    public int heapRightIdx(int parent){
        return (parent + 1) * 2;
    }

    public int heapPriorChildIdx(int[] line, int parent, int range){
        if (this.heapRightIdx(parent) < range)
            return line[this.heapLeftIdx(parent)] > line[this.heapRightIdx(parent)] ?
                    this.heapLeftIdx(parent) : this.heapRightIdx(parent);
        return this.heapLeftIdx(parent);
    }

    public void heapAdjustDown(int[] line, int idx, int range){
        int cur = idx;
        while (this.heapLeftIdx(cur) < range){
            int child = this.heapPriorChildIdx(line, cur, range);
            if (line[cur] > line[child]){
                break;
            }
            this.swap(line, cur, child);
            cur = child;
        }
    }

    public int deleteGreatestValue2(int[][] grid) {
        for (int[] line : grid) {
            Arrays.sort(line);
        }
        int res = 0;
        for (int row = 0; row < grid[0].length; row++) {
            int max = Topics.Other.modifiedMatrix.Solution.rowMax(grid, row);
            res += max;
        }
        return res;
    }

}
