public class Solution {
    
    public bool IsValid(string s) { 
        if(!Valid(ref s))return false;
        return (s == ""); 
    }
    
    public bool Valid(ref string s) {
        while(s != ""){
            char c;
            switch(s[0]){
                case '(' :{
                    c = ')';                   
                    break;
                }

                case '[' :{
                    c = ']';                    
                    break;
                }

                case '{' :{
                    c = '}';
                    break;
                }
                default:{
                    return true;
                    break;
                }
            }
            
            s = s.Remove(0, 1);

            
            if(!Valid(ref s))return false;
            
            
            if(s == "")
                return false;
            if(s[0] != c)
                return false;
            
            s = s.Remove(0, 1);    
        }
        return true;
    }
}
