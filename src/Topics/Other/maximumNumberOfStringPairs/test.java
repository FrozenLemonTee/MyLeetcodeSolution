package Topics.Other.maximumNumberOfStringPairs;

public class test {
    public static void main(String[] args) {
        System.out.println(new Solution().maximumNumberOfStringPairs(new String[]{"cd","ac","dc","ca","zz"}));
        System.out.println(new Solution().maximumNumberOfStringPairs(new String[]{"ab","ba","cc"}));
        System.out.println(new Solution().maximumNumberOfStringPairs(new String[]{"aa","ab"}));
        System.out.println();
        System.out.println(new Solution().maximumNumberOfStringPairs2(new String[]{"cd","ac","dc","ca","zz"}));
        System.out.println(new Solution().maximumNumberOfStringPairs2(new String[]{"ab","ba","cc"}));
        System.out.println(new Solution().maximumNumberOfStringPairs2(new String[]{"aa","ab"}));
    }
}
