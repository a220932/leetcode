class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> cn = new LinkedList<List<Integer>>();
        if (k == 0){
            List<Integer> en = new LinkedList<Integer>();
            cn.add(en);
            return cn;
        }
        if (n < k){
            return cn;
        }
        if (n == 1 && k == 1) {
            List<Integer> en = new LinkedList<Integer>();
            en.add(1);
            cn.add(en);
            return cn;
        }
        
        List<List<Integer>> cm = combine(n - 1, k - 1);
        for (List<Integer> ele : cm)
            ele.add(n);
        
        cn.addAll(combine(n - 1, k));
        cn.addAll(cm);
        return cn;
    }
}
