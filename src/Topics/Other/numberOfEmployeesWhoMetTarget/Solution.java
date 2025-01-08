package Topics.Other.numberOfEmployeesWhoMetTarget;

public class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int res = 0;
        for (int hour : hours) {
            if (hour >= target) {
                res += 1;
            }
        }
        return res;
    }
}
