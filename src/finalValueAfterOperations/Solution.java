package finalValueAfterOperations;

public class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int res = 0;
        for (String op : operations) {
            switch (op) {
                case "++X":
                case "X++":
                    res += 1;
                    break;
                default:
                    res -= 1;
            }
        }
        return res;
    }
}
