package Topics.SlidingWindow.maxFreq;

import java.util.HashMap;

public class Solution {
    public int maxFreq(String s, int maxLetters, int minSize, int maxSize) {
        HashMap<String, Integer> sub_strs = new HashMap<>();
        HashMap<Character, Integer> chars = new HashMap<>();
        char[] arr = s.toCharArray();
        int max_cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (chars.containsKey(arr[i])) {
                chars.put(arr[i], chars.get(arr[i]) + 1);
            }else {
                chars.put(arr[i], 1);
            }
            if (i  < minSize - 1){
                continue;
            }
            String sub_str = new String(arr, i - minSize + 1, minSize);
            int cnt;
            if (sub_strs.containsKey(sub_str)){
                cnt = sub_strs.get(sub_str) + 1;
                sub_strs.put(sub_str, cnt);
            }else {
                cnt = 1;
                sub_strs.put(sub_str, cnt);
            }
            if (i - minSize >= 0){
                if (chars.get(arr[i - minSize]) > 1) {
                    chars.put(arr[i - minSize], chars.get(arr[i - minSize]) - 1);
                }else {
                    chars.remove(arr[i - minSize]);
                }
            }
            max_cnt = chars.size() <= maxLetters ? Math.max(max_cnt, cnt) : max_cnt;
        }
        return max_cnt;
    }
}
