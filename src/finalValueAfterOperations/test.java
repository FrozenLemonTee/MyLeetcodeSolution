package finalValueAfterOperations;

public class test {
    public static void main(String[] args) {
        System.out.println(new Solution().finalValueAfterOperations(new String[]{"--X","X++","X++"}));
        System.out.println(new Solution().finalValueAfterOperations(new String[]{"++X","++X","X++"}));
        System.out.println(new Solution().finalValueAfterOperations(new String[]{"X++","++X","--X","X--"}));
    }
}
