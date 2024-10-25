package makeSmallestPalindrome;

public class Solution {
    public String makeSmallestPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;
        StringBuilder sb = new StringBuilder(s);
        while (l < r) {
            if (sb.charAt(l) != sb.charAt(r)) {
                char min = (char) Math.min(sb.charAt(l), sb.charAt(r));
                if (sb.charAt(l) < sb.charAt(r)) {
                    sb.replace(r, r + 1, Character.toString(min));
                } else {
                    sb.replace(l, l + 1, Character.toString(min));
                }
            }
            l += 1;
            r -= 1;
        }
        return sb.toString();
    }

    public String makeSmallestPalindrome2(String s) {
        StringBuilder sb = new StringBuilder();
        int l = 0;
        int r = s.length() - 1;
        while (l < r) {
            char min = (char) Math.min(s.charAt(l), s.charAt(r));
            sb.append(min);
            l += 1;
            r -= 1;
        }
        int back = l == r ? 1 : 0;
        if (l == r){
            sb.append(s.charAt(l));
        }
        for (int i = r - back; i >= 0; i--){
            sb.append(sb.charAt(i));
        }
        return sb.toString();
    }
}
