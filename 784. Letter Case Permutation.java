class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> L = new LinkedList<String>();
        if (s.length() == 0) return L;
        char c = s.charAt(0);
        if (s.length() == 1){
            if (c >= 'a' && c <= 'z')
                L.add("" + (char)(c - 'a' + 'A'));
            else if (c >= 'A' && c <= 'Z')
                L.add("" + (char)(c - 'A' + 'a'));
            L.add("" + c);
            
            return L;
        } 
        
        List<String> Ls = new LinkedList<String>();
        Ls = letterCasePermutation(s.substring(1));
        
        if (c >= 'a' && c <= 'z')
            putPm(L, (char)(c - 'a' + 'A'), Ls);
        else if (c >= 'A' && c <= 'Z')
            putPm(L, (char)(c - 'A' + 'a'), Ls);
        putPm(L, c, Ls);
                
        return L;        
    }
    public void putPm(List<String> L, char c, List<String> Ls) {
       for (String s : Ls){
            L.add("" + c + s);
       }
    }

}
