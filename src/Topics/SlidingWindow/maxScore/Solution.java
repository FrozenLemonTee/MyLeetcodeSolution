package Topics.SlidingWindow.maxScore;

public class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int cur_sum = 0;
        for (int i = 0; i < k; i++) {
            cur_sum += cardPoints[i];
        }
        int max_sum = cur_sum;
        for (int l = k - 1, r = cardPoints.length - 1, i = 0; i < k; l--, r--, i++){
            cur_sum += (cardPoints[r] - cardPoints[l]);
            max_sum = Math.max(max_sum, cur_sum);
        }
        return max_sum;
    }
}
