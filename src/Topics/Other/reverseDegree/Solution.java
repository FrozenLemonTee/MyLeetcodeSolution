package Topics.Other.reverseDegree;

public class Solution {
    public int reverseDegree(String s) {
        final char[] chars = s.toCharArray();
        int res = 0;
        for (int i = 0; i < chars.length; i++) {
            res += (26 - chars[i] + 'a') * (i + 1);
        }
        return res;
    }
}
