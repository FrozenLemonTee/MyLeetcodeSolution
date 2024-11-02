package maxVowels;

public class test {
    public static void main(String[] args) {
        System.out.println(new Solution().maxVowels("abciiidef", 3));
        System.out.println(new Solution().maxVowels("aeiou", 2));
        System.out.println(new Solution().maxVowels("leetcode", 3));
        System.out.println();
        System.out.println(new Solution().maxVowels2("abciiidef", 3));
        System.out.println(new Solution().maxVowels2("aeiou", 2));
        System.out.println(new Solution().maxVowels2("leetcode", 3));
        System.out.println(new Solution().maxVowels2("weallloveyou", 7));
    }
}
