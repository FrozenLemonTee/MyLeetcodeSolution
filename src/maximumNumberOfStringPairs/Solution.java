package maximumNumberOfStringPairs;

public class Solution {
    public boolean match(String s, String p) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != p.charAt(s.length() - i - 1))
                return false;
        }
        return true;
    }

    public int maximumNumberOfStringPairs(String[] words) {
        int count = 0;
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].length() == words[j].length() && this.match(words[i], words[j])) {
                    count += 1;
                    break;
                }
            }
        }
        return count;
    }

    public int maximumNumberOfStringPairs2(String[] words) {
        int count = 0;
        int[][] map = new int[26][26];
        for (String word : words) {
            int first = word.charAt(0) - 'a';
            int second = word.charAt(1) - 'a';
            map[first][second] = 1;
            if (map[second][first] == 1 && first != second){
                count += 1;
            }
        }
        return count;
    }
}
