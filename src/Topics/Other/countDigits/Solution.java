package Topics.Other.countDigits;

public class Solution {
    public int countDigits(int num) {
        int count = 0;
        int remainder = num;
        while (remainder > 0) {
            if (num % (remainder % 10) == 0){
                count += 1;
            }
            remainder /= 10;
        }
        return count;
    }
}
