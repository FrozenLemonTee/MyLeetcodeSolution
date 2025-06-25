package Topics.Other.minTimeToVisitAllPoints;

public class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int dis = 0;
        for (int i = 0; i < points.length - 1; i++) {
            int deltaX = Math.abs(points[i][0] - points[i + 1][0]);
            int deltaY = Math.abs(points[i][1] - points[i + 1][1]);
            int delta = deltaX > deltaY ? deltaY + (deltaX - deltaY) : deltaX + (deltaY - deltaX);
            dis += delta;
        }
        return dis;
    }
}
