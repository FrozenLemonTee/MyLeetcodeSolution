package Topics.Other.sortTheStudents;

import java.util.Arrays;

public class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        int[][] res = score.clone();
        Arrays.sort(res, (o1, o2) -> {
            if (o1[k] == o2[k])
                return 0;

            return o1[k] < o2[k] ? 1 : -1;
        });
        return res;
    }
}
