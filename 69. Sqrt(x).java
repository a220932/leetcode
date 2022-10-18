class Solution {
    public int mySqrt(int x) {
        double r = x+0.01;      //I don't know why +0.01
        while (r/100 >= 1) r /= 100;
        return Sqrt(x, r, 0, 0);
    }
    public int Sqrt(int x, double r, int sum, int y) {
        if(x == 0)return y;
        
        y *= 10;
        sum *= 10;
        
        int t = 0;
        for(int i = 0; (sum + i) * i <= r ; i++)t = i;
        
        r -= (sum + t) * t;
        
        y += t;
        sum += t * 2;
        
        x /= 100; 
        r *= 100;
        return Sqrt(x, r, sum, y);
    }
    
}
