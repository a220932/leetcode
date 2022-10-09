public class Solution {
    public int RomanToInt(string s) {
        int sum = 0;
        int temp = 0;
        for(int i = 0; i<s.Length; i++){
            if((R2I(s[i]) <= temp && temp < 3 * R2I(s[i])) || temp == 0){
                temp += R2I(s[i]);
                continue;
            }
            if(R2I(s[i]) > temp){
                temp = R2I(s[i]) - temp;
                sum += temp;
                temp = 0;
                continue;
            }
            else{
                
        

                sum += temp;
                temp = R2I(s[i]);

                
            }
        }
        sum += temp;
        return sum;
    }
    public int R2I(char c) {
        switch(c){
                case 'I': return 1;
                case 'V': return 5;
                case 'X': return 10;
                case 'L': return 50;
                case 'C': return 100;
                case 'D': return 500;
                case 'M': return 1000;
                


        }
        return 0;
    }
}
