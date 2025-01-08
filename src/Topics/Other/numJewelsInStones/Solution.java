package Topics.Other.numJewelsInStones;

public class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int[][]  map = new int[26][2];
        for (Character c : jewels.toCharArray()) {
            if (Character.isUpperCase(c)){
                map[c - 'A'][0]++;
            }else {
                map[c - 'a'][1]++;
            }
        }
        int count = 0;
        for (Character c : stones.toCharArray()) {
            if (Character.isUpperCase(c)){
                if (map[c - 'A'][0] != 0){
                    count++;
                }
            }else {
                if (map[c - 'a'][1] != 0){
                    count++;
                }
            }
        }
        return count;
    }
}
