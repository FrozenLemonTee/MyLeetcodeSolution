package Topics.Other.generateKey;

public class Solution {
    public int generateKey(int num1, int num2, int num3) {
        int[] key = {9, 9, 9, 9};
        for (int i = 0; i < 4; i++) {
            key[3 - i] = Math.min(key[3 - i], num1 % 10);
            key[3 - i] = Math.min(key[3 - i], num2 % 10);
            key[3 - i] = Math.min(key[3 - i], num3 % 10);
            num1 /= 10;
            num2 /= 10;
            num3 /= 10;
        }
        return key[3] + 10 * key[2] + 100 * key[1] + 1000 * key[0];
    }
}
