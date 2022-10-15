class Solution {
    public boolean isIsomorphic(String s, String t) {
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            char d = t.charAt(i);
            for(int j = i+1; j < s.length(); j++){
                if(s.charAt(j) == c){
                    if(t.charAt(j) != d)return false;
                }
                else if(t.charAt(j) == d)return false;
            }
            s.replace(c+"", "");
            t.replace(d+"", "");
        }
        return true;
    }
}
