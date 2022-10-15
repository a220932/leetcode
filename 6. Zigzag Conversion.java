class Solution {
    public String convert(String s, int numRows) {
        int len = s.length();
        if(numRows == 1 || len <= numRows)return s;
        
        //g+m const
        int m = (numRows - 1) * 2;
        int g = 0;
        
        String ss = ""; 
        while(m >= 0){
            int i = g/2;
            while(i<len){
                if(m != 0 && i<len)
                    ss += s.charAt(i);
                i+=m;
                if(g != 0 && i<len)
                    ss += s.charAt(i);
                i+=g;
            }
            m-=2;
            g+=2;
        }
        return ss;
    }
}
