package minimumChairs;

public class Solution {
    public int minimumChairs(String s) {
        int cur = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'E') {
                cur +=1;
            }else if (s.charAt(i) == 'L') {
                cur -= 1;
            }else {
                cur -= 1;
            }
            max = Math.max(max, cur);
        }
        return max;
    }
}
