package findWordsContaining;

public class test {
    public static void main(String[] args) {
        System.out.println(new Solution().findWordsContaining(new String[] {"leet","code"}, 'e'));
        System.out.println(new Solution().findWordsContaining(new String[] {"abc","bcd","aaaa","cbc"}, 'a'));
        System.out.println(new Solution().findWordsContaining(new String[] {"abc","bcd","aaaa","cbc"}, 'z'));
    }
}
