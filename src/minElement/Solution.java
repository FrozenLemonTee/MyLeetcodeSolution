package minElement;

public class Solution {
    public int numDigitsSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public int minElement(int[] nums) {
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            min = Math.min(this.numDigitsSum(num), min);
        }
        return min;
    }
}
