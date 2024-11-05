package countMatches;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        System.out.println(new Solution().countMatches(Arrays.asList(
                Arrays.asList("phone", "blue", "pixel"),
                Arrays.asList("computer", "silver", "lenovo"),
                Arrays.asList("phone", "gold", "iphone")
        ), "color", "silver"));
        System.out.println(new Solution().countMatches(Arrays.asList(
                Arrays.asList("phone", "blue", "pixel"),
                Arrays.asList("computer", "silver", "phone"),
                Arrays.asList("phone", "gold", "iphone")
        ), "type", "phone"));
    }
}
