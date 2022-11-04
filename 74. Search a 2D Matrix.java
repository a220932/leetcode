class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int[] a = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++)
            a[i] = matrix[i][0];
        int x = bis(a, target);
        if (x == -1)
            return false;
        int y = find(matrix[x] , target);
        if (y == -1)
            return false;
        return true;
    }
    public int bis(int[] a, int tar){
        int l = -1, h = a.length - 1;
        while (l < h){
            int m = (l + h + 1) / 2; 
            if (a[m] == tar)
                return m;
            if (a[m] < tar)
                l = m;
            else
                h = m - 1;
        }
        return l;
    }
    public int find(int[] a, int tar){
        int l = 0, h = a.length - 1;
        while (l <= h){
            int m = (l + h) / 2; 
            if (a[m] == tar)
                return m;
            if (a[m] < tar)
                l = m + 1;
            else
                h = m - 1;
        }
        return -1;
    }
}
