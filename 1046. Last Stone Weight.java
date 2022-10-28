class Solution {
    public int lastStoneWeight(int[] stones) {
        if (stones.length == 1)
            return stones[0];
        
        int a = -1, b = -1;
        for (int i = 0; i < stones.length; i++){
            if (stones[i] == 0)
                continue;
            if (a == -1 || stones[i] > stones[a]){
                b = a;
                a = i;
                continue;
            }
            if (b == -1 || stones[i] > stones[b]){
                b = i;
                continue;
            }
            
        }
        
        if (a == -1)
            return 0;
        
        if (b == -1)
            return stones[a];
        
        stones[a] -= stones[b];
        stones[b] = 0;
        return lastStoneWeight(stones);
    }
}
