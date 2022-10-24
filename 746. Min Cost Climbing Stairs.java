class Solution {
    public int minCostClimbingStairs(int[] cost) {
        return climbStairs(cost, cost.length);
    }
    
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();

    public int climbStairs(int[] cost, int n) {
        if (n == 0) return cost[0];
        if (n == 1) return cost[1];
        if (map.get(n) != null) return map.get(n);
        
        int cn = 0;
        if(n < cost.length)
            cn = cost[n];
        
        
        cn += min(climbStairs(cost, n - 1), climbStairs(cost, n - 2));
        map.put(n, cn);
        return cn;
    }
    public int min(int a, int b) {
        if (a <= b)return a;
        return b;
    }
}
