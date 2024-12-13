package decodeMessage;

import java.util.HashMap;

public class Solution {
    public String decodeMessage(String key, String message) {
        HashMap<Character, Character> map = new HashMap<>();
        int i = 0;
        for (char c : key.toCharArray()) {
            if (!map.containsKey(c) && !Character.isSpaceChar(c)) {
                map.put(c, (char) ('a' + i));
                i += 1;
            }
        }
        char[] res = new char[message.length()];
        for (int j = 0; j < message.length(); j++) {
            res[j] = map.containsKey(message.charAt(j)) ? map.get(message.charAt(j)) : message.charAt(j);
        }
        return new String(res);
    }
}
