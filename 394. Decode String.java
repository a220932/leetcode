class Solution {
    public String decodeString(String s) {
        if (s == "")
            return "";
        
        //pointer: i -> '[',  j -> ']'
        int i = 0;
        while (i < s.length()){
            if (s.charAt(i) == '[')
                break;
            else
                i++;
        }
        if (i == s.length())
            return s;
        
        int j = i, flic = -1;
        while (flic != 0){
            j++;
            if (s.charAt(j)=='[')
                flic--;
            if (s.charAt(j)==']')
                flic++;
        }
        
        
        //result string: ds
        String ds = "";
        
        int t = 0;
        for (; t < i; t++){
            if(s.charAt(t) < '0' || s.charAt(t) > '9')
                ds += s.charAt(t);
            else
                break;
        }
        
        
        //repeat times: k, repeat string: ss   is between '[' and ']'
        int k = Integer.parseInt(s.substring(t, i));
        String ss = decodeString(s.substring(i + 1, j));
        
        while (k-- > 0)
            ds += ss;
        
        
        ds += decodeString(s.substring(j + 1));
        return ds;
    }
}
