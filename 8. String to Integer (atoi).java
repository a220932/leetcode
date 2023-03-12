class Solution {
    public int myAtoi(String s) {
        int n = s.length();
        int i = 0;
        while(i < n && s.charAt(i) == ' ') i++;
        
        if (i >= n)return 0;
        char c = s.charAt(i);    
        int ng = 1;   
        if (c == '+' || c == '-') {
            ng = ((c == '+')?1:-1);
            i++;
        }

        int sum = 0;
        for (; i < n; i++) {
            c = s.charAt(i);
            if (c >= '0' && c <= '9') {
                int k = sum;
                sum *= 10;
                sum += c-'0';
                if (sum/10 != k)
                    if(ng == 1)
                        return Integer.MAX_VALUE;
                    else
                        return Integer.MIN_VALUE;
            }
            else
                break;
        }
        return sum * ng;
    }
}
