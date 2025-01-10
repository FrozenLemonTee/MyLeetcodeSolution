package Topics.SlidingWindow.hasAllCodes;

import java.util.HashSet;

public class Solution {
    public boolean hasAllCodes(String s, int k) {
        int len = (int) Math.pow(2, k);
        if (s.length() - k  + 1 < len)
            return false;

        char[] chars = s.toCharArray();
        HashSet<Integer> hs = new HashSet<>();
        for (int end = k; end < chars.length + 1; end++) {
            hs.add(Integer.parseInt(new String(chars, end - k, k), 2));
            if (hs.size() == len)
                return true;
        }
        return hs.size() == len;
    }

    public boolean hasAllCodes2(String s, int k) {
        int len = (int) Math.pow(2, k);
        if (s.length() - k  + 1 < len)
            return false;

        char[] chars = s.toCharArray();
        HashSet<Integer> hs = new HashSet<>();
        int cur_num = Integer.parseInt(new String(chars, 0, k), 2);
        for (int end = k; end < chars.length + 1; end++) {
            if (end == k){
                hs.add(cur_num);
            }else {
                cur_num = ((cur_num - (int)Math.pow(2, k - 1) *
                           this.charValue(chars[end - k - 1])) << 1) +
                           this.charValue(chars[end - 1]);
                hs.add(cur_num);
            }

            if (hs.size() == len)
                return true;
        }
        return hs.size() == len;
    }

    public int charValue(Character c){
        return c == '1' ? 1 : 0;
    }
}
