package Topics.Other.getFinalState;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().getFinalState(new int[]{2, 1, 3, 5, 6}, 5, 2)));
        System.out.println(Arrays.toString(new Solution().getFinalState2(new int[]{2, 1, 3, 5, 6}, 5, 2)));
    }
}
