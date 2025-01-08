package Topics.Other.checkIfPangram;

public class Solution {
    public boolean checkIfPangram(String sentence) {
        int tag = 0;
        int count = 0;
        for (char c : sentence.toCharArray()) {
            if (!this.tagContains(tag, c)) {
                count++;
                tag = this.tagSet(tag, c);
            }
        }
        return count == 26;
    }

    public int tagSet(int tag, char c){
        int digit = c - 'a';
        return tag ^ 1 << digit;
    }

    public boolean tagContains(int tag, char c){
        int digit = c - 'a';
        return (tag & (1 << digit)) != 0;
    }
}
