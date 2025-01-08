package Topics.Other.balancedStringSplit;

public class Solution {
    public int balancedStringSplit(String s) {
        int count = 0;
        int left = 0;
        int right = 0;
        for (char c : s.toCharArray()) {
            if (c == 'L') left += 1;
            else right += 1;
            if (left == right && left != 0) {
                left = 0;
                right = 0;
                count += 1;
            }
        }
        return count;
    }
}
