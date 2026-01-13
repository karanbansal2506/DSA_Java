package LeetCode;
// https://leetcode.com/problems/minimum-time-visiting-all-points/?envType=daily-question&envId=2026-01-12

class MinTimeToVisitAllPoints {
    public int minTimeToVisitAllPoints(int[][] points) {
        int total_time = 0;
        for (int i = 0; i < points.length-1; i++) {
            total_time += time_one_point_to_another(points[i],points[i+1]);
        }
        return total_time;
    }
    static int time_one_point_to_another(int[] point1, int[] point2){
        int x = Math.abs(point1[0] - point2[0]);
        int y = Math.abs(point1[1] - point2[1]);

        return Math.max(x, y);
    }
}