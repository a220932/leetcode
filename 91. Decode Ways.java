class Solution {
    public int numDecodings(String s) {
        int n = s.length();
        int[] c = new int[n + 1];
        c[n] = 1;
        c[n-1] = ((s.charAt(n-1) == '0')?0:1);

        for (int i = n-2; i >= 0; i--){
            c[i] = 0;
            if (s.charAt(i) != '0') {
                c[i] += c[i+1];
                if (s.charAt(i) == '1')
                    c[i] += c[i+2];
                else if (s.charAt(i) == '2' && s.charAt(i+1) <= '6')
                    c[i] += c[i+2];
                
            }
        }
        return c[0];
    }
}
