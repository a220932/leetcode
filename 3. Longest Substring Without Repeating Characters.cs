public class Solution {
    public int LengthOfLongestSubstring(string s) {
        int l = 0, t = 0;
        int i = 0;
        while(i < s.Length){
            blt(s, ref t, i);
            if(i - t + 1 > l)
                l = i - t + 1;
            i++;
        }
        return l;
    }
    public void blt(string s, ref int t, int j){
        for(int i = t; i < j; i++)
            if(s[i] == s[j])
                t = i + 1;
    }
}
