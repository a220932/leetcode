class Solution {
    public String intToRoman(int num) {
        char[] r1 = {'I', 'X', 'C', 'M'};
        char[] r5 = {'V', 'L', 'D'};
        
        String result = "";
        int digit;
        for (int d = 0; d < 3; d++){
            digit = num % 10;
            String dig = "";
            switch (digit) {
                case 9 :{
                    dig = "" + r1[d] + r1[d + 1];
                    break;
                }
                case 8 :
                case 3 :{
                    dig += "" + r1[d];
                }
                case 7 :
                case 2 :{
                    dig += "" + r1[d];
                }
                case 6 :
                case 4 :
                case 1 :{
                    dig += "" + r1[d];
                }
                case 5:
                default:
                    if(digit >= 5)
                        dig = r5[d] + dig;
                    if(digit == 4)
                        dig += "" + r5[d];
                    break;
            }
            result = dig + result;
            num /= 10;
        }
        
        
        
        while(num-- > 0) result = r1[3] + result;        
        
        return result;
    }
}
