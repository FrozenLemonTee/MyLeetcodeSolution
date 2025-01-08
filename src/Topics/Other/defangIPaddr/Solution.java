package Topics.Other.defangIPaddr;

public class Solution {
    public String defangIPaddr(String address) {
        return address.replaceAll("[.]", "[.]");
    }

    public String defangIPaddr2(String address) {
        StringBuilder sb = new StringBuilder();
        for (char c : address.toCharArray()) {
            if (c == '.') {
                sb.append("[.]");
            }else sb.append(c);
        }
        return sb.toString();
    }
}
