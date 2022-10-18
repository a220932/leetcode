class Solution {
    public String countAndSay(int n) {
        if (n == 1)return "1";
        return count(countAndSay(n-1));
    }
    public String count(String s) {
        String result = "";
        
        char hold = s.charAt(0);
        int count = 1;
        for (int i = 1; i < s.length(); i++){
            
            if (hold != s.charAt(i)){
                result += count + "" +hold;
                hold = s.charAt(i);
                count = 0;
            }
            count++;
        }
        result += count + "" +hold;
        return result;
    }
}
