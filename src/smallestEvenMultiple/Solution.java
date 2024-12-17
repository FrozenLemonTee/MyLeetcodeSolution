package smallestEvenMultiple;

public class Solution {
    public int smallestEvenMultiple(int n) {
        int[] multi = new int[] {1, 1}; // 2*1, n*1
        while (multi[0] * 2 != multi[1] * n) {
            if (multi[0] * 2 > multi[1] * n){
                multi[1]++;
            }else {
                multi[0]++;
            }
        }
        return multi[0] * 2;
    }
}
