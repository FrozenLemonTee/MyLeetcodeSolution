package finalPositionOfSnake;

import java.util.List;

public class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int[] pos = new int[2];
        for(String command : commands){
            switch (command) {
                case "UP" -> pos[0] -= 1;
                case "DOWN" -> pos[0] += 1;
                case "LEFT" -> pos[1] -= 1;
                default -> pos[1] += 1;
            }
        }
        return pos[0] * n + pos[1];
    }
}
