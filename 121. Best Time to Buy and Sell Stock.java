class Solution {
    public int maxProfit(int[] prices) {
        
        int pf = 0;
        int st = prices[0];
        for (int i = 0; i < prices.length; i++) {
            prices[i] -= st;
        }
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] > pf) pf = prices[i];
            if(prices[i] < 0){
                st = prices[i];
                for (int j = i; j < prices.length; j++) {
                    prices[j] -= st;
                }
            }
        }
        return pf;
    }
}
