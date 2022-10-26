class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> L = new LinkedList<Integer>();
        
        
        if (s == "")
            return L;
        
        int[] count = new int[256];
        for (int i = 0; i < p.length(); i++)
            count[p.charAt(i)]--;
        
        
        
        int left = 0, right = 0;
        int len = 0;
        while (right < s.length()) {
            
            while (count[s.charAt(right)] == 0 && left <= right)
                if(count[s.charAt(left++)]-- <= 0)
                    len--;
            
            if (count[s.charAt(right++)]++ < 0)
                len++;
            
            if (len == p.length()) {
                L.add(left);
                count[s.charAt(left++)]--;
                len--;
            }
        }
        return L;
    }
}
