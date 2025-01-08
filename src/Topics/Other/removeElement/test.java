package Topics.Other.removeElement;

public class test {
    public static void main(String[] args) {
        System.out.println(new Solution().removeElement(new int[]{3,2,2,3}, 3));
        System.out.println(new Solution().removeElement(new int[]{0,1,2,2,3,0,4,2}, 2));
        System.out.println(new Solution().removeElement(new int[]{}, 0));
        System.out.println(new Solution().removeElement(new int[]{1}, 1));
        System.out.println(new Solution().removeElement(new int[]{1}, 2));
        System.out.println(new Solution().removeElement(new int[]{1,2}, 2));
        System.out.println(new Solution().removeElement(new int[]{0,2,3,1,1,2,0,2,4}, 99));
        System.out.println();
        System.out.println(new Solution().removeElement2(new int[]{3,2,2,3}, 3));
        System.out.println(new Solution().removeElement2(new int[]{0,1,2,2,3,0,4,2}, 2));
        System.out.println(new Solution().removeElement2(new int[]{}, 0));
        System.out.println(new Solution().removeElement2(new int[]{1}, 1));
        System.out.println(new Solution().removeElement2(new int[]{1}, 2));
        System.out.println(new Solution().removeElement2(new int[]{1,2}, 2));
        System.out.println(new Solution().removeElement2(new int[]{0,2,3,1,1,2,0,2,4}, 99));
    }
}
