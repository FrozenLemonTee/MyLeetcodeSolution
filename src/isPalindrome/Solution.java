package isPalindrome;

import java.util.ArrayList;
import java.util.Objects;

public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0){
            return false;
        }
        String s = String.valueOf(x);
        int l = 0;
        int r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l += 1;
            r -= 1;
        }
        return true;
    }

    public boolean isPalindrome2(int x) {
        if (x < 0){
            return false;
        }
        ArrayList<Integer> list = new ArrayList<>();
        int base = 10;
        while (x > 0){
            list.add(x % base);
            x /= base;
        }
        int l = 0;
        int r = list.size() - 1;
        while (l < r){
            if (!Objects.equals(list.get(l), list.get(r))){
                return false;
            }
            l += 1;
            r -= 1;
        }
        return true;
    }

    public boolean isPalindrome3(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)){
            return false;
        }
        int sum = 0;
        int digit = 0;
        while (x > sum){
            sum *= 10;
            digit = x % 10;
            sum += digit;
            x /= 10;
        }
        if (x == sum){
            return true;
        }else {
            sum -= digit;
            sum /= 10;
            return x == sum;
        }
    }
}
