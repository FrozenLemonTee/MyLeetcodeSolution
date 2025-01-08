package Topics.SlidingWindow.maxSatisfied;

public class test {
    public static void main(String[] args) {
        System.out.println(new Solution().maxSatisfied(
                new int[] {1,0,1,2,1,1,7,5}, new int[] {0,1,0,1,0,1,0,1}, 3));
        System.out.println(new Solution().maxSatisfied(
                new int[] {5,8}, new int[] {0,1}, 1));
        System.out.println(new Solution().maxSatisfied2(
                new int[] {1,0,1,2,1,1,7,5}, new int[] {0,1,0,1,0,1,0,1}, 3));
        System.out.println(new Solution().maxSatisfied2(
                new int[] {5,8}, new int[] {0,1}, 1));
    }
}
