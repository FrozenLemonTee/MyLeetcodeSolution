package findPermutationDifference;

public class Solution {
    public int findPermutationDifference(String s, String t) {
        assert s.length() == t.length();
        int[][] diff = new int[26][2];
        for (int i = 0; i < s.length(); i++) {
            diff[s.charAt(i) - 'a'][0] = i;
            diff[t.charAt(i) - 'a'][1] = i;
        }
        int res = 0;
        for (int i = 0; i < 26; i++) {
            res += Math.abs(diff[i][0] - diff[i][1]);
        }
        return res;
    }

    public int findPermutationDifference2(String s, String t) {
        assert s.length() == t.length();
        int[] diff = new int[26];
        for (int i = 0; i < s.length(); i++) {
            int diff1 = s.charAt(i) - 'a';
            int diff2 = t.charAt(i) - 'a';
            diff[diff1] = Math.abs(i - diff[diff1]);
            diff[diff2] = Math.abs(i - diff[diff2]);
        }
        int res = 0;
        for (int i = 0; i < 26; i++) {
            res += diff[i];
        }
        return res;
    }
}
