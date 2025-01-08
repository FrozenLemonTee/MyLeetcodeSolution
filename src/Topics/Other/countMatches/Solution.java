package Topics.Other.countMatches;

import java.util.List;
import java.util.Objects;

public class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        for (List<String> item : items) {
            if (Objects.equals(ruleKey, "type") && Objects.equals(ruleValue, item.get(0))) {
                count += 1;
            }else if (Objects.equals(ruleKey, "color") && Objects.equals(ruleValue, item.get(1))) {
                count += 1;
            }else if (Objects.equals(ruleKey, "name") && Objects.equals(ruleValue, item.get(2))) {
                count += 1;
            }
        }
        return count;
    }
}
