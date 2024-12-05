package sumOfTheDigitsOfHarshadNumber;

public class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum_digits = 0;
        int _x = x;
        while (_x > 0) {
            sum_digits += _x % 10;
            _x /= 10;
        }
        return x % sum_digits == 0 ? sum_digits : -1;
    }
}
