package interpret;

public class test {
    public static void main(String[] args) {
        System.out.println(new Solution().interpret("G()(al)"));
        System.out.println(new Solution().interpret("G()()()()(al)"));
        System.out.println(new Solution().interpret("(al)G(al)()()G"));
    }
}
