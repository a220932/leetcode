class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        int[] count = new int[256];
        int c = 0;
        for (int i = 0; i < s.length(); i++)
            if (count[s.charAt(i)]++ == 0)
                c++;
        for (int i = 0; i < t.length(); i++){
            if (--count[t.charAt(i)] < 0)
                return false;
            if (count[t.charAt(i)] == 0)
                --c;
        }
        if (c == 0)
            return true;
        return false;
    }
}
