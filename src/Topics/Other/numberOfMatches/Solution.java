package Topics.Other.numberOfMatches;

public class Solution {
    public int numberOfMatches(int n) {
        int remains = n;
        int res = 0;
        while (remains > 1){
            if (remains % 2 == 0){
                res += remains / 2;
                remains /= 2;
            }else {
                res += (remains - 1) / 2;
                remains = (remains - 1) / 2 + 1;
            }
        }
        return res;
    }
}
