package scoreOfString;

public class Solution {
    public int scoreOfString(String s) {
        assert !s.isEmpty() && s.length() <= 100;
        int sum = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            sum += Math.abs(s.charAt(i) - s.charAt(i + 1));
        }
        return sum;
    }
}
