class Solution {
    public String multiply(String num1, String num2) {
        if (num1.charAt(0) == '0' || num2.charAt(0) == '0')
            return "0";
        
        int m = num1.length(), n = num2.length();
        
        String s = "";
        int sum = 0, rem = 0;        
        for (int k = 1; k < m + n; k++){
            sum = rem; 
            for (int i = 1; i <= m; i++){
                int j = k - i + 1;
                if (j <= n && j >= 1)
                    sum += dig(num1, i) * dig(num2, j);
            }
            char c = (char)('0' + (sum % 10)); 
            s = c + s;
            rem = sum / 10;
        }
        while (rem != 0){
            char c = (char)('0' + (rem % 10)); 
            s = c + s;
            rem /= 10;
        }
        
        return s;
    }
    public int dig(String num, int i) {
        return num.charAt(num.length() - i) - '0';
    }
}
