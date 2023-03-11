class Solution {
    public int tribonacci(int n) {
        int a = 0, b = 1, c = 1, d;
        while(n > 2){
            d = a + b + c;
            a = b;
            b = c;
            c = d;
            n--;
        }
        if (n == 0)return a;
        if (n == 1)return b;
        return c;
    }
}
