package Topics.SlidingWindow.decrypt;

import java.util.Arrays;

public class Solution {
    public int[] decrypt(int[] code, int k) {
        int[] result = new int[code.length];
        if (k == 0){
            Arrays.fill(result, 0);
            return result;
        }
        boolean reverse = k < 0;
        for (int i = 0; i < code.length; i++) {
            result[i] = kSum(code, i, k, reverse);
        }
        return result;
    }

    public int kSum(int[] arr, int start, int k, boolean reverse) {
        int sum = 0;
        for (int i = 0, idx = (start + (int) Math.pow(-1, reverse ? 1 : 0) + arr.length) % arr.length; i < Math.abs(k);
             i++, idx = (idx + (int) Math.pow(-1, reverse ? 1 : 0) + arr.length) % arr.length){
            sum += arr[idx];
        }
        return sum;
    }

    public int[] decrypt2(int[] code, int k) {
        int[] result = new int[code.length];
        if (k == 0){
            Arrays.fill(result, 0);
            return result;
        }
        boolean reverse = k < 0;
        result[0] = kSum(code, 0, k, reverse);
        for (int i = 1; i < result.length; i++) {
            if (!reverse)
                result[i] = result[i - 1] - code[i] + code[(i + k) % code.length];
            else
                result[i] = result[i - 1] + code[i - 1] - code[(i - 1 + k) % code.length];
        }
        return result;
    }
}
