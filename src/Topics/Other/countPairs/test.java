package Topics.Other.countPairs;

import java.util.ArrayList;
import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        System.out.println(new Solution().countPairs(new ArrayList<>(Arrays.asList(-1,1,2,3,1)), 2));
        System.out.println(new Solution().countPairs(new ArrayList<>(Arrays.asList(-6,2,5,-2,-7,-1,3)), -2));
    }
}
