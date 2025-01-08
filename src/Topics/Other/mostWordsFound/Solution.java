package Topics.Other.mostWordsFound;

public class Solution {
    public int mostWordsFound(String[] sentences) {
        int space_max = 0;
        for (String s : sentences) {
            int space = 0;
            for (char c : s.toCharArray()) {
                if (c == ' ') {
                    space++;
                }
            }
            space_max = Math.max(space_max, space);
        }
        return space_max + 1;
    }
}
