package Topics.Other.validStrings;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public List<String> validStrings(int n) {
        if (n == 1)
            return List.of("0", "1");
        if (n == 2)
            return List.of("10", "01", "11");

        List<String> res = new ArrayList<>();
        final List<String> RECUR = validStrings(n - 1);
        for (final String S : RECUR) {
            final char[] SRC = S.toCharArray();
            char[] dst = new char[n];
            for (int i = 0; i <= n - 1; i++) {
                System.arraycopy(SRC, 0, dst, 0, i);
                dst[i] = '1';
                System.arraycopy(SRC, i, dst, i + 1, n - 1 - i);
                res.add(String.valueOf(dst));
                if ((i > 0 && SRC[i - 1] == '0') || (i < n - 1 && SRC[i] == '0')) {
                    continue;
                }
                System.arraycopy(SRC, 0, dst, 0, i);
                dst[i] = '0';
                System.arraycopy(SRC, i, dst, i + 1, n - 1 - i);
                res.add(String.valueOf(dst));
            }
        }
        return res.stream().distinct().collect(Collectors.toList());
    }
}
