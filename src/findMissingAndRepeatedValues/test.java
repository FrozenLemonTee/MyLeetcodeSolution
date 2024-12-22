package findMissingAndRepeatedValues;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().findMissingAndRepeatedValues(new int[][]{{1, 3}, {2, 2}})));
        System.out.println(Arrays.toString(new Solution().findMissingAndRepeatedValues2(new int[][]{{1, 3}, {2, 2}})));
    }
}
