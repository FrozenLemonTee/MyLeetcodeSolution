package Topics.Other.destCity;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Solution {
    public String destCity(List<List<String>> paths) {
        HashMap<String, String> map = new HashMap<>();
        for (List<String> path : paths) {
            map.put(path.get(0), path.get(1));
        }
        String start = map.keySet().toArray()[0].toString();
        while (map.containsKey(start)) {
            start = map.get(start);
        }
        return start;
    }

    public String destCity2(List<List<String>> paths) {
        HashSet<String> start = new HashSet<>();
        HashSet<String> end = new HashSet<>();
        for (List<String> path : paths) {
            start.add(path.get(0));
            end.add(path.get(1));
        }
        end.removeAll(start);
        return end.toArray()[0].toString();
    }
}
