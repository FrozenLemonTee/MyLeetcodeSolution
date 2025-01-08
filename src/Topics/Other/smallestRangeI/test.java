package Topics.Other.smallestRangeI;

public class test {
    public static void main(String[] args) {
        System.out.println(new Solution().smallestRangeI(new int[] {1}, 0));
        System.out.println(new Solution().smallestRangeI(new int[] {0, 10}, 2));
        System.out.println(new Solution().smallestRangeI(new int[] {1, 3, 6}, 3));
        System.out.println(new Solution().smallestRangeI(new int[] {9, 3, 6}, 2));
        System.out.println();
        System.out.println(new Solution().smallestRangeI2(new int[] {1}, 0));
        System.out.println(new Solution().smallestRangeI2(new int[] {0, 10}, 2));
        System.out.println(new Solution().smallestRangeI2(new int[] {1, 3, 6}, 3));
        System.out.println(new Solution().smallestRangeI2(new int[] {9, 3, 6}, 2));
    }
}
