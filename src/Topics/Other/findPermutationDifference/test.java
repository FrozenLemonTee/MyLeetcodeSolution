package Topics.Other.findPermutationDifference;

public class test {
    public static void main(String[] args) {
        System.out.println(new Solution().findPermutationDifference("abc", "bac"));
        System.out.println(new Solution().findPermutationDifference("abcde", "edbac"));
        System.out.println(new Solution().findPermutationDifference("rwohu", "rwuoh"));
        System.out.println();
        System.out.println(new Solution().findPermutationDifference2("abc", "bac"));
        System.out.println(new Solution().findPermutationDifference2("abcde", "edbac"));
        System.out.println(new Solution().findPermutationDifference2("rwohu", "rwuoh"));
    }
}
