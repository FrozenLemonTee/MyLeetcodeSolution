package isAcronym;

import java.util.List;

public class Solution {
    public boolean isAcronym(List<String> words, String s) {
        int i = 0;
        for (; i < words.size(); i++) {
            if (i == s.length() || words.get(i).charAt(0) != s.charAt(i)) {
                return false;
            }
        }
        return i == s.length();
    }
}
