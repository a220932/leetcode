class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        if (triangle == null) return 0;
        
        int path;        
        for (int level = triangle.size() - 2 ; level >= 0; level--){
            for (int i = 0; i < triangle.get(level).size(); i++){
                path = triangle.get(level).get(i);
                path += min(triangle.get(level + 1).get(i), triangle.get(level + 1).get(i + 1));
                triangle.get(level).set(i, path);
            }
        }
        
        return triangle.get(0).get(0);
    }
    public int min(int a, int b){
        if (a < b)return a;
        return b;
    }
}
