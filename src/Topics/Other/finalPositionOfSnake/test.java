package Topics.Other.finalPositionOfSnake;

import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        System.out.println(new Solution().finalPositionOfSnake(2, new ArrayList<>(List.of("RIGHT", "DOWN"))));
        System.out.println(new Solution().finalPositionOfSnake(3, new ArrayList<>(List.of("DOWN","RIGHT","UP"))));
    }
}
