class Solution {
    public boolean backspaceCompare(String s, String t) {
        int i = s.length() - 1;
        int j = t.length() - 1;
        while (true){
            
            i = bs(s, i);
            j = bs(t, j);
            
            if(i < 0 || j < 0)
                break;
            
            if (s.charAt(i--) != t.charAt(j--))
                return false;
        }
        if (i < 0 && j < 0)
            return true;
        return false;
    }
    public int bs(String s, int i){
        if (i < 0)
            return i;
        int bs = 0;
        while (s.charAt(i) == '#') {
            if (--i < 0)
                return i;
            bs++;
        }
        while (bs > 0){
            if (--i < 0)
                return i;

            if (s.charAt(i) == '#')
                i = bs(s, i);
            bs--;
        }
        return i;
    }
}
