package LeetCode;

class EscapeGhosts {
    public boolean escapeGhosts(int[][] ghosts, int[] target) {
        int[] arr = new int[ghosts.length];
        for (int i = 0; i < ghosts.length; i++) {
            arr[i] = total_steps(ghosts[i], target);
        }

        int steps = Math.abs(target[1]) + Math.abs(target[0]);

        for (int i = 0; i < arr.length; i++) {
            if (steps >= arr[i]){
                return false;
            }
        }
        return true;
    }
    static int total_steps(int[] point1, int[] point2){
        int x = Math.abs(point1[0] - point2[0]);
        int y = Math.abs(point1[1] - point2[1]);

        return x+y;
    }
}