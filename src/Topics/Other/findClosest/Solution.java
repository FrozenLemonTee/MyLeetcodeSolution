package Topics.Other.findClosest;

public class Solution {
    public int findClosest(int x, int y, int z) {
        final int diff = Math.abs(x - z) - Math.abs(y - z);
        if (diff == 0)
            return 0;

        return diff < 0 ? 1 : 2;
    }
}
