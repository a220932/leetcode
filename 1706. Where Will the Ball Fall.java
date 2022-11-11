class Solution {
    public int[] findBall(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] a = new int[m + 1][n];
        for (int j = 0; j < n; j++)
            a[m][j] = j;

        for (int i = m - 1; i >= 0; i--){
            Arrays.fill(a[i], -1);
            for (int j = 0; j < n; j++){
                if (a[i + 1][j] == -1)
                    continue;
                if (grid[i][j] == 1 && j - 1 >= 0){
                    if (grid[i][j - 1] == 1)
                        a[i][j - 1] = a[i + 1][j];
                }
                else if (grid[i][j] == -1 && j + 1 < n){
                    if (grid[i][j + 1] == -1)
                        a[i][j + 1] = a[i + 1][j];
                }
                
            }
        }
        
        return a[0];
    }
}
