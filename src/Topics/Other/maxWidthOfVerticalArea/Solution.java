package Topics.Other.maxWidthOfVerticalArea;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        Arrays.sort(points, Comparator.comparingInt(o -> o[0]));
        int max_width = 0;
        for (int i = 1; i < points.length; i++) {
            max_width = Math.max(max_width, points[i][0] - points[i - 1][0]);
        }
        return max_width;
    }
}
