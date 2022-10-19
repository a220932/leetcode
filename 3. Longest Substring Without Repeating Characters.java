class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = s.length();
        if (l == 0)return 0;
        int[] a = new int[l];
        a[0] = 1;
        int h = 1;
        for(int i = 1; i < l; i++){
            a[i] = 1;
            for (int k = 1; k <= a[i - 1]; k++){
                if (s.charAt(i) != s.charAt(i - k)){
                    a[i]++;
                }
                else
                    break;
            }
            if (h < a[i])h = a[i];
        }
        return h;
    }
}
