package convertDateToBinary;


public class Solution {
    public String convertDateToBinary(String date) {
        String[] split = date.split("-");
        StringBuilder result = new StringBuilder();
        for (String s : split) {
            int num = Integer.parseInt(s);
            result.append(Integer.toBinaryString(num)).append("-");
        }
        return result.deleteCharAt(result.length()- 1).toString();
    }
}
