package Topics.SlidingWindow.decrypt;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().decrypt(new int[]{5, 7, 1, 4}, 3)));
        System.out.println(Arrays.toString(new Solution().decrypt(new int[]{2, 4, 9, 3}, -2)));
        System.out.println(Arrays.toString(new Solution().decrypt2(new int[]{5, 7, 1, 4}, 3)));
        System.out.println(Arrays.toString(new Solution().decrypt2(new int[]{2, 4, 9, 3}, -2)));
        System.out.println(Arrays.toString(new Solution().decrypt2(new int[]{10,5,7,7,3,2,10,3,6,9,1,6}, -4)));
    }
}
