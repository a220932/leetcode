class Solution {
    public boolean isHappy(int n) {
        int s = next(n), f = next(s);
        while (f != s){
            s = next(s);
            f = next(next(f));
        }
        if (s == 1)
            return true;
        return false;
    }
    
    public int next(int n) {
        int m = 0;
        while (n != 0){
            m += (n % 10) * (n % 10);
            n /= 10;
        }
        return m;        
    }
}
