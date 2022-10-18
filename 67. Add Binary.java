class Solution {
    public String addBinary(String a, String b) {
        int p1 = a.length() - 1, p2 = b.length() - 1;
        String result = "";
        int count = 0;
        while(count != 0 || p1 >= 0 || p2 >= 0){
            if (p1 >= 0) if (a.charAt(p1--) == '1') count++;
            if (p2 >= 0) if (b.charAt(p2--) == '1') count++;
            if (count % 2 == 1)
                result = "1" + result;
            else
                result = "0" + result;
            count /= 2;
        }
        
        return result;
    }
}
