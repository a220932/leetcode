class Solution {
    public int longestPalindrome(String s) {
        int[] count = new int[256];
        for (int i = 0; i < s.length(); i++){
            count[s.charAt(i)]++;
        }
        int l = 0, flag = 0;
        for (int i = 0; i < 256; i++){
            if(count[i] == 0)continue;
            if(count[i]%2 == 1){
                flag = 1;
                l += count[i] - 1;
            }
            else
                l += count[i];
        }
        return l + flag;
    }
}
