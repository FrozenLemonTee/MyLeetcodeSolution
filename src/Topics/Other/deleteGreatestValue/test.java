package Topics.Other.deleteGreatestValue;

public class test {
    public static void main(String[] args) {
        System.out.println(new Solution().deleteGreatestValue(new int[][]{
                {1,2,4}, {3,3,1}
        }));
        System.out.println(new Solution().deleteGreatestValue(new int[][]{
                {9,81},{33,17}
        }));
        System.out.println(new Solution().deleteGreatestValue2(new int[][]{
                {1,2,4}, {3,3,1}
        }));
        System.out.println(new Solution().deleteGreatestValue2(new int[][]{
                {9,81},{33,17}
        }));
    }
}
