package Topics.Other.stableMountains;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> stableMountains(int[] height, int threshold) {
        assert height.length >= 2 && height.length <= 100;
        assert threshold >= 1 && threshold <= 100;
        assert  height[0] >= 1 && height[0] <= 100;
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 1; i < height.length; i++) {
            assert height[i] >= 1 && height[i] <= 100;
            if (height[i - 1] > threshold){
                res.add(i);
            }
        }
        return res;
    }
}
