class Solution {
    public int reverse(int x) {
        int flag = -1;
        if(x < 0) x *= flag;
        else flag = 1;
        
        
        int y = 0;
        for (; x > 0; x/=10) {
            int t = y;
            if(y > Integer.MAX_VALUE/10){
                return 0;
            }
            y *= 10;
            y += x%10;
            if(t > y)return 0;
        }
        return y * flag;
    }
}
