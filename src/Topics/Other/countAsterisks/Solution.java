package Topics.Other.countAsterisks;

public class Solution {
    public int countAsterisks(String s) {
        boolean in_couple = false;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '|') in_couple = !in_couple;
            if (s.charAt(i) == '*' && !in_couple) count += 1;
        }
        return count;
    }
}
