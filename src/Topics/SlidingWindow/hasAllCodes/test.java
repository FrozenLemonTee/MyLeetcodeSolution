package Topics.SlidingWindow.hasAllCodes;

public class test {
    public static void main(String[] args) {
        System.out.println(new Solution().hasAllCodes("0101001010011101110100101010001110111011001", 5));
        System.out.println(new Solution().hasAllCodes("0000000001011100", 4));
        System.out.println(new Solution().hasAllCodes("00110", 2));
        System.out.println();
        System.out.println(new Solution().hasAllCodes2("0101001010011101110100101010001110111011001", 5));
        System.out.println(new Solution().hasAllCodes2("0000000001011100", 4));
        System.out.println(new Solution().hasAllCodes2("00110", 2));
    }
}
