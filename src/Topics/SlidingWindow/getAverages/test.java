package Topics.SlidingWindow.getAverages;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().getAverages(new int[]{7, 4, 3, 9, 1, 8, 5, 2, 6}, 3)));
        System.out.println(Arrays.toString(new Solution().getAverages(new int[]{100000}, 0)));
        System.out.println(Arrays.toString(new Solution().getAverages(new int[]{8}, 100000)));
        System.out.println(Arrays.toString(new Solution().getAverages(new int[]{1,11,17,21,29}, 4)));
    }
}
