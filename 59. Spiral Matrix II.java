class Solution {
    public int[][] generateMatrix(int n) {
        int[][] m = new int[n][n];
        int c = 1;
        int x = 0, y = -1, dx = 0, dy = 1;
        for (int turn = n; turn > 0;){
            for (int step = 0; step < turn; step++){
                x += dx;
                y += dy;
                m[x][y] = c++;
            }
            int t = -dx;
            dx = dy;
            dy = t;
            turn--;
            for (int step = 0; step < turn; step++){
                x += dx;
                y += dy;
                m[x][y] = c++;
            }
            t = -dx;
            dx = dy;
            dy = t;
        }
        return m;
    }
}
