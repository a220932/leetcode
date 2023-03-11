class Solution {
    public boolean divisorGame(int n) {
        if (n == 1)return false;
        boolean[] win = new boolean[n+1];
        win[1] = false;
        win[2] = true;
        for (int i = 3; i <= n; i++){
            win[i] = false;
            for (int d = 1; d < i; d++){
                if (i%d == 0 && !win[i-d]){
                    win[i] = true;
                    break;
                }
            }
        }
        return win[n];
    }
}
