class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> L = new LinkedList<Integer>();
        for (int i = 0; i <= rowIndex; i++){
            L.add(1);
            for (int j = i - 1; j > 0; j--){
                L.set(j, L.get(j) + L.get(j - 1));
            }
        }
        return L;
    }
}
