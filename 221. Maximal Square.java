class Solution {
    int n, m;
    public int maximalSquare(char[][] matrix) {
        m = matrix.length;
        n = matrix[0].length;
        int[][] sqare = new int[m][n];

        int max = -1;

        for(int i = m-1; i >= 0; i--){
            for(int j = n-1; j >= 0; j--){
                if(matrix[i][j] == '0')
                    sqare[i][j] = 0;
                else {
                    int r = 0, d = 0;
                    if(i+1 < m) 
                        r = sqare[i+1][j];
                    if(j+1 < n) 
                        d = sqare[i][j+1];
                    
                    int s = ((r < d)?r:d);
                    sqare[i][j] = s + ((matrix[i+s][j+s]=='1')?1:0);
                }
                if(sqare[i][j] > max)
                    max = sqare[i][j];
            }
        }
        return max*max;
    }
}
