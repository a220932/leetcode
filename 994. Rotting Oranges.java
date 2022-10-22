class Solution {
    public int orangesRotting(int[][] grid) {
        int time = 0;
        while (aMinute(grid))time++;
        for (int i = 0; i < grid.length; i++)
            for (int j = 0; j < grid[0].length; j++)
                if (grid[i][j] == 1)
                    return -1;
        return time;
    }
    public boolean aMinute(int[][] grid) {
        boolean change = false;
        for (int i = 0; i < grid.length; i++){
            for (int j = 0; j < grid[0].length; j++){
                if (grid[i][j] == 2){
                    rotten(grid, i + 1, j);
                    rotten(grid, i - 1, j);
                    rotten(grid, i, j - 1);
                    rotten(grid, i, j + 1);
                }
            }
        }
        
        for (int i = 0; i < grid.length; i++){
            for (int j = 0; j < grid[0].length; j++){
                if (grid[i][j] == -2) {
                    grid[i][j] = 2;
                    change = true;
                }
            }
        }
        return change;
    }
    public void rotten(int[][] grid, int i, int j) {
        if (i >= 0 && i < grid.length)
            if (j >= 0 && j < grid[0].length)
                if (grid[i][j] == 1)
                    grid[i][j] = -2;

    }
    
}
