class Solution {
    public int maxProfit(int[] prices) {
        int hold = prices[0];
        int sell = prices[0];
        int sum = 0;
        for (int k : prices){
            if (sell < k){
                sell = k;
            }
            else if (sell > k){
                sum += sell - hold;
                hold = k;
                sell = k;
            }
            else if (hold > k){
                hold = k;
                sell = k;
            }
        }
        sum += sell - hold;
        return sum;
    }
}
