package Topics.Other.cellsInRange;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> cellsInRange(String s) {
        char row_start = s.charAt(1);
        char row_end = s.charAt(4);
        char col_start = s.charAt(0);
        char col_end = s.charAt(3);
        ArrayList<String> result = new ArrayList<>();
        for (char i = col_start; i <= col_end; i++) {
            for (char j = row_start; j <= row_end; j++) {
                result.add(new String(new char[] {i, j}));
            }
        }
        return result;
    }
}
