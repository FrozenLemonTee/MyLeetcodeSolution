package Topics.Other.findIntersectionValues;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(
                new Solution().findIntersectionValues(new int[]{2, 3, 2}, new int[]{1, 2})));
        System.out.println(Arrays.toString(
                new Solution().findIntersectionValues(new int[]{4,3,2,3,1}, new int[]{2,2,5,2,3,6})));
        System.out.println(Arrays.toString(
                new Solution().findIntersectionValues(new int[]{3,4,2,3}, new int[]{1,5})));
        System.out.println();
        System.out.println(Arrays.toString(
                new Solution().findIntersectionValues2(new int[]{2, 3, 2}, new int[]{1, 2})));
        System.out.println(Arrays.toString(
                new Solution().findIntersectionValues2(new int[]{4,3,2,3,1}, new int[]{2,2,5,2,3,6})));
        System.out.println(Arrays.toString(
                new Solution().findIntersectionValues2(new int[]{3,4,2,3}, new int[]{1,5})));
    }
}
