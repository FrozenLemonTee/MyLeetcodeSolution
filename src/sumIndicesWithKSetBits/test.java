package sumIndicesWithKSetBits;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test {
    public static void main(String[] args) {
        System.out.println(new Solution().hasKSetBits(5, 2));
        System.out.println();
        System.out.println(new Solution().sumIndicesWithKSetBits(new ArrayList<Integer>(Arrays.asList(5,10,1,5,2)), 1));
        System.out.println(new Solution().sumIndicesWithKSetBits(new ArrayList<Integer>(Arrays.asList(4,3,2,1)), 2));
        System.out.println(new Solution().sumIndicesWithKSetBits(new ArrayList<Integer>(List.of(1)), 0));
        System.out.println();
        System.out.println(new Solution().sumIndicesWithKSetBits2(new ArrayList<Integer>(Arrays.asList(5,10,1,5,2)), 1));
        System.out.println(new Solution().sumIndicesWithKSetBits2(new ArrayList<Integer>(Arrays.asList(4,3,2,1)), 2));
        System.out.println(new Solution().sumIndicesWithKSetBits2(new ArrayList<Integer>(List.of(1)), 0));
    }
}
