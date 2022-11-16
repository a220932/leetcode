class Solution {
    int n = 0;
    public void rotate(int[][] matrix) {
        n = matrix.length;
        dia(matrix);
        symY(matrix);
    }
    public void dia(int[][] m){
        int d = n - 1;
        while (d > 0){
            for (int i = n - 1; i - d >= 0; i--){
                int t = m[i][i-d];
                m[i][i - d] = m[i - d][i];
                m[i - d][i] = t;
            }
            d--;
        }
    }
    public void symY(int[][] m){
        int l = 0, r = n - 1;
        while (l < r){
            for (int i = 0; i < n; i++){
                int t = m[i][l];
                m[i][l] = m[i][r];
                m[i][r] = t;
            }
            l++;
            r--;
        }
    }
}
