package countTestedDevices;

public class test {
    public static void main(String[] args) {
        System.out.println(new Solution().countTestedDevices(new int[] {1, 1, 2, 1, 3}));
        System.out.println(new Solution().countTestedDevices(new int[] {0, 1, 2}));
        System.out.println(new Solution().countTestedDevices(new int[] {1, 2, 1, 3, 2, 0, 1, 2, 1, 6, 2}));
        System.out.println();
        System.out.println(new Solution().countTestedDevices2(new int[] {1, 1, 2, 1, 3}));
        System.out.println(new Solution().countTestedDevices2(new int[] {0, 1, 2}));
        System.out.println(new Solution().countTestedDevices2(new int[] {1, 2, 1, 3, 2, 0, 1, 2, 1, 6, 2}));
    }
}
