package Topics.Other.countConsistentStrings;

public class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        boolean[] map = new boolean[26];
        for (char c : allowed.toCharArray()) {
            map[c - 'a'] = true;
        }
        int count = 0;
        for (String word : words) {
            if (this.isConsistent(word, map)) {
                count += 1;
            }
        }
        return count;
    }

    public boolean isConsistent(String word, boolean[] map) {
        for (char c : word.toCharArray()) {
            if (!map[c - 'a']) {
                return false;
            }
        }
        return true;
    }
}
