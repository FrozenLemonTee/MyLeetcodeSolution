package Topics.Other.countPoints;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().countPoints(new int[][]{
                new int[]{1, 3},
                new int[]{3, 3},
                new int[]{5, 3},
                new int[]{2, 2}
                },
                new int[][]{
                        new int[]{2, 3, 1},
                        new int[]{4, 3, 1},
                        new int[]{1, 1, 2}
                })));
    }
}
