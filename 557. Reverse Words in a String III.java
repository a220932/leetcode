class Solution {
    public String reverseWords(String s) {
        String ss = "", sss = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                sss = " " + ss + sss;
                ss = "";
            }
            else
                ss += s.charAt(i);
        }
        sss = ss + sss;
        return sss;
    }
}
