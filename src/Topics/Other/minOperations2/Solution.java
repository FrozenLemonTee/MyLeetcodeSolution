package Topics.Other.minOperations2;

public class Solution {
    public int[] minOperations(String boxes) {
        final int n = boxes.length();
        int[] res = new int[n];
        char[] b = boxes.toCharArray();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                res[i] += Math.abs(i - j) * (b[j] - '0');
            }
        }
        return res;
    }

    public int[] minOperations2(String boxes) {
        final int n = boxes.length();
        final char[] b = boxes.toCharArray();
        int cur_balls = 0;
        int cur_cost = 0;
        int[] prefix = new int[n];
        for (int i = 0; i < n; i++) {
            prefix[i] = cur_cost + cur_balls;
            if (b[i] == '1') {
                cur_balls += 1;
            }
            cur_cost = prefix[i];
        }

        cur_balls = 0;
        cur_cost = 0;
        int[] postfix = new int[n];
        for (int i = 0; i < n; i++) {
            postfix[i] = cur_cost + cur_balls;
            if (b[n - i - 1] == '1'){
                cur_balls += 1;
            }
            cur_cost = postfix[i];
        }

        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = prefix[i] + postfix[n - i - 1];
        }

        return res;
    }
}
