package Topics.SlidingWindow.minimumRecolors;

public class Solution {
    public int minimumRecolors(String blocks, int k) {
        int count = this.initCnt(blocks, k);
        int min_count = count;
        char[] chars = blocks.toCharArray();
        for (int end = k; end < blocks.length(); end++) {
            if (chars[end] == 'W')
                count ++;
            if (chars[end - k] == 'W')
                count --;
            min_count = Math.min(min_count, count);
        }
        return min_count;
    }

    // Count the number of 'W' in the first k characters of a string
    public int initCnt(String blocks, int k) {
        int cnt = 0;
        char[] chars = blocks.toCharArray();
        for (int i = 0; i < k; i++) {
            if (chars[i] == 'W')
                cnt ++;
        }
        return cnt;
    }

    public int minimumRecolors2(String blocks, int k) {
        int count = 0;
        int min_count = Integer.MAX_VALUE;
        char[] chars = blocks.toCharArray();
        for (int end = 0; end < blocks.length(); end++) {
            if (chars[end] == 'W')
                count ++;
            if (end - k >= 0 && chars[end - k] == 'W')
                count --;
            if (end - k >= -1)
                min_count = Math.min(min_count, count);
        }
        return min_count;
    }
}
