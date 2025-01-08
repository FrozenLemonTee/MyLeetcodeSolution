package Topics.Other.twoSum;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().twoSum2(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(new Solution().twoSum2(new int[]{3, 2, 4}, 6)));
        System.out.println(Arrays.toString(new Solution().twoSum2(new int[]{3, 3}, 6)));
        System.out.println(Arrays.toString(new Solution().twoSum2(new int[]{1, 5, 2, 40, 9, 3}, 41)));
        System.out.println();
        System.out.println(Arrays.toString(new Solution().twoSum(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(new Solution().twoSum(new int[]{3, 2, 4}, 6)));
        System.out.println(Arrays.toString(new Solution().twoSum(new int[]{3, 3}, 6)));
        System.out.println(Arrays.toString(new Solution().twoSum(new int[]{1, 5, 2, 40, 9, 3}, 41)));
        System.out.println();
        System.out.println(Arrays.toString(new Solution().twoSum3(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(new Solution().twoSum3(new int[]{3, 2, 4}, 6)));
        System.out.println(Arrays.toString(new Solution().twoSum3(new int[]{3, 3}, 6)));
        System.out.println(Arrays.toString(new Solution().twoSum3(new int[]{1, 5, 2, 40, 9, 3}, 41)));
    }
}
