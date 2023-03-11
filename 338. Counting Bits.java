class Solution {
    public int[] countBits(int n) {
        n++;
        int[] c = new int[n];
        c[0] = 0;
        if  (n == 0)
            return c;
        
        for (int i = 1; i < n; i++){
            c[i] = i%2 + c[i/2];
        }
        return c;
    }
}
