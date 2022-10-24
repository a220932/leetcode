class Solution {
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    public int climbStairs(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        if (map.get(n) != null) return map.get(n);
        
        int cn = climbStairs(n - 1) + climbStairs(n - 2);
        map.put(n, cn);
        return cn;
    }
}
