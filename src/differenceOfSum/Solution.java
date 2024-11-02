package differenceOfSum;

class Solution {
    public int digitSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public int differenceOfSum(int[] nums) {
        int elem_sum = 0;
        int digit_sum = 0;
        for (int num : nums) {
            elem_sum += num;
            digit_sum += this.digitSum(num);
        }
        return Math.abs(elem_sum - digit_sum);
    }
}
