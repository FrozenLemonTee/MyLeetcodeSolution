package Topics.Other.squareIsWhite;

public class Solution {
    public boolean squareIsWhite(String coordinates) {
        char[] chars = coordinates.toCharArray();
        return (chars[0] - 'a' + chars[1] - '1') % 2 != 0;
    }
}
