class Solution {
    Map<Integer, Integer> f = new HashMap<Integer, Integer>();
    public int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (f.get(n) != null) return f.get(n);
        
        int fn = fib(n - 1) + fib(n - 2);
        f.put(n, fn);
        return fn;
        
    }
}
