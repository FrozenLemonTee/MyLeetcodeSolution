package Topics.SlidingWindow.maxVowels;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int maxVowels(String s, int k) {
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        int res;
        int cnt = 0;
        int l = 0;
        int r = 0;
        while (r < k){
            if (vowels.contains(s.charAt(r))){
                cnt += 1;
            }
            r += 1;
        }
        res = cnt;
        while (r < s.length()){
            if (vowels.contains(s.charAt(r))){
                cnt += 1;
            }
            if (vowels.contains(s.charAt(l))){
                cnt -= 1;
            }
            l += 1;
            r += 1;
            res = Math.max(res, cnt);
        }
        return res;
    }

    public int vowelsCount(String s, int start, int len) {
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        int res = 0;
        for (int i = start; i < start + len; i++) {
            if (vowels.contains(s.charAt(i))){
                res += 1;
            }
        }
        return res;
    }

    // out of time limit
    public int maxVowels2(String s, int k) {
        int res = 0;
        for (int i = 0; i <= s.length() - k; i++) {
            res = Math.max(res, this.vowelsCount(s, i, k));
        }
        return res;
    }
}
