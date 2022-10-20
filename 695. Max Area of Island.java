class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        for (int i = 0; i < grid.length; i++){
            for (int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 1){
                    int count = countArea(grid, i, j);
                    if (count > max) max = count;
                }
                
            }
        }
        return max;
    }
    public int countArea(int[][] image, int sr, int sc) {
        int pick = image[sr][sc];
        if (pick == 0) return 0;
        image[sr][sc] = 0;
        int count = 1;
        
        if(sr + 1 < image.length)
            if (image[sr + 1][sc] == pick)
                count += countArea(image, sr + 1, sc);

        
        if(sr - 1 >= 0)
            if (image[sr - 1][sc] == pick) 
                count += countArea(image, sr - 1, sc);
        
        
        if(sc + 1 < image[0].length)
            if (image[sr][sc + 1] == pick) 
                count += countArea(image, sr, sc + 1);

        if(sc - 1 >= 0)
            if (image[sr][sc - 1] == pick) 
                count += countArea(image, sr, sc - 1);
        
        return count;
    }
}
