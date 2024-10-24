package getSneakyNumbers;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().getSneakyNumbers(new int[]{0, 1, 1, 0})));
        System.out.println(Arrays.toString(new Solution().getSneakyNumbers(new int[]{0, 3, 2, 1, 3, 2})));
        System.out.println(Arrays.toString(new Solution().getSneakyNumbers(new int[]{7, 1, 5, 4, 3, 4, 6, 0, 9, 5, 8, 2})));
        System.out.println();
        System.out.println(Arrays.toString(new Solution().getSneakyNumbers2(new int[]{0, 1, 1, 0})));
        System.out.println(Arrays.toString(new Solution().getSneakyNumbers2(new int[]{0, 3, 2, 1, 3, 2})));
        System.out.println(Arrays.toString(new Solution().getSneakyNumbers2(new int[]{7, 1, 5, 4, 3, 4, 6, 0, 9, 5, 8, 2})));
    }
}
