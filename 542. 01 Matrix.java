class Solution {
    public int[][] updateMatrix(int[][] mat) {
        for (int i = 0; i < mat.length; i++)
            for (int j = 0; j < mat[i].length; j++)
                mat[i][j] *= -1;
        
        int lev = 0;
        while (!iscomplete(mat))leveling(mat, lev++);
        return mat;
    }
    
    public void leveling(int[][] grid, int lev) {
        for (int i = 0; i < grid.length; i++){
            for (int j = 0; j < grid[0].length; j++){
                if (grid[i][j] == lev){
                    nlev(grid, lev, i + 1, j);
                    nlev(grid, lev, i - 1, j);
                    nlev(grid, lev, i, j - 1);
                    nlev(grid, lev, i, j + 1);
                }
            }
        }
    }
    
    public boolean iscomplete(int[][] grid) {
        for (int i = 0; i < grid.length; i++){
            for (int j = 0; j < grid[0].length; j++){
                if (grid[i][j] < 0)
                    return false;
            }
        }
        return true;
    }
    
    public void nlev(int[][] grid, int lev, int i, int j) {
        if (i >= 0 && i < grid.length)
            if (j >= 0 && j < grid[0].length)
                if (grid[i][j] < 0)    
                    grid[i][j] = lev + 1;

    }
}
