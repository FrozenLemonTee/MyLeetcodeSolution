package Topics.SlidingWindow.maxSum;

import Utils.Methods.Methods;

public class test {
    public static void main(String[] args) {
        System.out.println(new Solution().maxSum(Methods.toArrayList(new Integer[] {2,6,7,3,1,7}), 3, 4));
        System.out.println(new Solution().maxSum(Methods.toArrayList(new Integer[] {5,9,9,2,4,5,4}), 1, 3));
        System.out.println(new Solution().maxSum(Methods.toArrayList(new Integer[] {1,2,1,2,1,2,1}), 3, 3));
        System.out.println(new Solution().maxSum(Methods.toArrayList(new Integer[] {1,1,1,3}), 2, 2));
    }
}
