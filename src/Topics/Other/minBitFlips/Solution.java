package Topics.Other.minBitFlips;

public class Solution {
    public int minBitFlips(int start, int goal) {
        int count = 0;
        int max = Math.max(start, goal);
        for (int i = 0, cur = 1; cur <= max; i++, cur <<= 1){
            if (getBit(start, i) != getBit(goal, i)){
                count++;
            }
        }
        return count;
    }

    public static boolean getBit(int value, int bit) {
        return (value & (1 << bit)) != 0;
    }
}
