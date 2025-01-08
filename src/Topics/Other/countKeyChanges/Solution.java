package Topics.Other.countKeyChanges;

public class Solution {
    public int countKeyChanges(String s) {
        char recent = Character.toLowerCase(s.charAt(0));
        int count = 0;
        for (Character c : s.toCharArray()) {
            char cur = Character.toLowerCase(c);
            if (cur != recent) {
                recent = cur;
                count ++;
            }
        }
        return count;
    }
}
