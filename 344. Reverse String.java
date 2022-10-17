class Solution {
    public void reverseString(char[] s) {
        char c;
        int a = 0, b = s.length-1;
        while (a<b) {
            c = s[a];
            s[a++] = s[b];
            s[b--] = c;
        }
    }
}
