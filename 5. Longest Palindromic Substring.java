class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        int max = -1, a = 0, b = 0;
        int flip = 0;
        for (int i = 0; i < n; ){
            int k = seek(i, i+flip, n, s);
            if (max < 2*k + flip-1){
                max = 2*k + flip-1;
                a = i-k+1;
                b = i+flip+k;
            }
            if (flip == 0){
                if (i+1 == n)
                    break;
                else
                    flip = 1;
            }
            else
                i += flip--;                
        }
        //return ""+max;
        return s.substring(a, b);
    }
    
    int seek(int i, int j, int n, String s){
        if (i < 0 || j == n)
            return 0;
        if (s.charAt(i) != s.charAt(j))
            return 0;
        return 1 + seek(i-1, j+1, n, s);
    }
}
