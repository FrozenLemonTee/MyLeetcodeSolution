package removeTrailingZeros;

public class Solution {
    public String removeTrailingZeros(String num) {
        return num.replaceAll("0+$", "");
    }

    public String removeTrailingZeros2(String num) {
        int index = 0;
        for (int i = 0; i < num.length(); i++) {
            if (num.charAt(i) != '0'){
                index = i;
            }
        }
        return num.substring(0, index + 1);
    }
}
