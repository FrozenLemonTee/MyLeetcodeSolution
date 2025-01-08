package Topics.Other.repeatedCharacter;

import java.util.BitSet;

public class Solution {
    public char repeatedCharacter(String s) {
        BitSet set = new BitSet(26);
        for (char c : s.toCharArray()) {
            if (set.get(c - 'a')){
                return c;
            }else {
                set.set(c - 'a');
            }
        }
        return s.charAt(s.length() - 1);
    }

    public char repeatedCharacter2(String s) {
        int map = 0;
        for (char c : s.toCharArray()) {
            if (mapContains(map, c - 'a')){
                return c;
            }else {
                map = mapSet(map, c - 'a');
            }
        }
        return s.charAt(s.length() - 1);
    }

    public static int mapSet(int map, int index){
        return map | 1 << index;
    }

    public static boolean mapContains(int map, int index){
        return (map & 1 << index) != 0;
    }
}
