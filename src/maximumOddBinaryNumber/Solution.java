package maximumOddBinaryNumber;

public class Solution {
    public String maximumOddBinaryNumber(String s) {
        int count_one = 0;
        for (char c : s.toCharArray()) {
            if (c == '1') count_one++;
        }
        char[] res = new char[s.length()];
        for (int i = count_one - 1; i < s.length() - 1; i++) {
            res[i] = '0';
        }
        for (int i = 0; i < count_one - 1; i++) {
            res[i] = '1';
        }
        res[res.length - 1] = '1';
        return new String(res);
    }
}
