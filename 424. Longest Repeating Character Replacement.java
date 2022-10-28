class Solution {
    public int characterReplacement(String s, int k) {
        int l = s.length();
        if (l <= k || l == 1) return l;
        
        char[] arr = s.toCharArray();
        int[] count = new int[256];
        int max = 0;
        
        int left = 0, right = 0, len = 0;
        int feq = 0;
        while (right < l) {
            if  (++count[arr[right]] > feq)
                feq = count[arr[right]];
            right++;
            len++;
            
            
            if (len <= feq + k)
                max = Math.max(len, max);
            
            if (len > feq + k){
                count[arr[left]]--;
                left++;
                len--;
            }
            
            
        }
        return max;
    }
}
