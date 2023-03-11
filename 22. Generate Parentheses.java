class Solution {
    List<String> list = new LinkedList<String>();
    public List<String> generateParenthesis(int n) {
        if (n == 0)
            return list;
        genp(n, n, "");
        return list;
    }
    void genp(int c, int p, String str){
        if (p == 0){
            list.add(str);
            return;
        }
        if (c != 0)
            genp(c-1, p, str+"(");
        if (p > c)
            genp(c, p-1, str+")");
    }
}
