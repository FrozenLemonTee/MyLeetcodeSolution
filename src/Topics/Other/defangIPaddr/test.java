package Topics.Other.defangIPaddr;

public class test {
    public static void main(String[] args) {
        System.out.println(new Solution().defangIPaddr("1.1.1.1"));
        System.out.println(new Solution().defangIPaddr("255.100.50.0"));
        System.out.println();
        System.out.println(new Solution().defangIPaddr2("1.1.1.1"));
        System.out.println(new Solution().defangIPaddr2("255.100.50.0"));
    }
}
