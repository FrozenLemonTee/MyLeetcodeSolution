package finalString;

public class Solution {
    public String finalString(String s) {
        int count_i = 0;
        for (char c : s.toCharArray()) {
            if (c == 'i') {
                count_i++;
            }
        }
        char[] res = new char[s.length() - count_i];
        int i = 0, j = 0;
        while (i < s.length()) {
            if (s.charAt(i) == 'i') {
                this.reverse(res, 0, j);
            }else {
                res[j] = s.charAt(i);
                j += 1;
            }
            i += 1;
        }
        return new String(res);
    }

    public void reverse(char[] s, int start, int end) {
        for (int i = start, j = end - 1; i < j; i++, j--) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
        }
    }
}
