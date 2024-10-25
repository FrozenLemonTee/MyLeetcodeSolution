package differenceOfSums;

public class Solution {
    public int differenceOfSums(int n, int m) {
        int res = 0;
        for (int i = 0; i <= n; i++) {
            res += (i % m != 0 ? 1: -1) * i;
        }
        return res;
    }

    public int differenceOfSums2(int n, int m) {
        int k = Math.floorDiv(n, m);
        return (1 + n) * n / 2 - (1 + k) * k * m;
    }
}
