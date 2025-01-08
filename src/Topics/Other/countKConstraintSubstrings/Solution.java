package Topics.Other.countKConstraintSubstrings;

public class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        int len = s.length();

        if (k >= len)
            return (len + 1) * k / 2;

        int count_res = (2 * len - k + 1) * k / 2;
        for (int i = k + 1; i <= len; i++) {
            int count_one = initCount(s, i);
            if (count_one <= k || i - count_one <= k)
                count_res++;
            for (int j = i; j < len; j++) {
                if (s.charAt(j) == '1')
                    count_one++;
                if (s.charAt(j - i) == '1')
                    count_one--;
                if (count_one <= k || i - count_one <= k)
                    count_res++;
            }
        }
        return count_res;
    }

    public static int initCount(String s, int len){
        int count = 0;
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == '1')
                count++;
        }
        return count;
    }
}
