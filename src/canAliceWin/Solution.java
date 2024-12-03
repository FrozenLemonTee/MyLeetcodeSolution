package canAliceWin;

public class Solution {
    public boolean canAliceWin(int[] nums) {
        int single_digits = 0;
        int ten_digits = 0;
        for (int num : nums) {
            if (num < 10){
                single_digits += num;
            }else {
                ten_digits += num;
            }
        }
        return single_digits != ten_digits;
    }
}
