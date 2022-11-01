class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> LL = new LinkedList<List<Integer>>();
        List<Integer> L1 = new LinkedList<Integer>();
        L1.add(1);
        LL.add(L1);
        if (numRows <= 1)
            return LL;
        
        for (int r = 1; r < numRows; r++){
            List<Integer> Lr = new LinkedList<Integer>();
            Lr.add(1);
            for (int t = 1; t <= r; t++){
                if (t == r)
                    Lr.add(LL.get(r - 1).get(t - 1));
                else
                    Lr.add(LL.get(r - 1).get(t - 1) + LL.get(r - 1).get(t));

            }
            LL.add(Lr);
        }
        return LL;
    }
}
