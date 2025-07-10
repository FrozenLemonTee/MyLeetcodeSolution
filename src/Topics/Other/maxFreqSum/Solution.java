package Topics.Other.maxFreqSum;

public class Solution {
    static public boolean isVowel(char c) {
        final char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        for (final char v : vowels) {
            if (c == v) {
                return true;
            }
        }
        return false;
    }

    public int maxFreqSum(String s) {
        int[] freq = new int[26];
        final char[] chars = s.toCharArray();
        for (final char c : chars) {
            freq[c - 'a']++;
        }
        int freq_max_vowel = 0;
        int freq_max_consonant = 0;
        for (int i = 0; i < freq.length; i++) {
            final char c = (char)(i + 'a');
            if (isVowel(c)) {
                freq_max_vowel = Math.max(freq_max_vowel, freq[i]);
            }else {
                freq_max_consonant = Math.max(freq_max_consonant, freq[i]);
            }
        }
        return freq_max_vowel + freq_max_consonant;
    }
}
