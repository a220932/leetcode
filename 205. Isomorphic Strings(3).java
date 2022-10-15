class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] map1 = new int[256];
        Arrays.fill(map1, -1);
        int[] map2 = new int[256];
        Arrays.fill(map2, -1);
        char c, v;
        for(int i = 0; i < s.length(); i++){
            c = s.charAt(i);
            v = t.charAt(i);
            if(!(map1[c]==v && map2[v]==c))
                if(!(map1[c]==-1 && map2[v]==-1))    
                    return false;
            
            map1[c] = v;
            map2[v] = c;
        }
        return true;
    }
}
