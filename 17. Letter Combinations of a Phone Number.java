class Solution {
    List<String> list = new LinkedList<String>();
    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0)
            return list;
        comb(0, "", digits);
        return list;
    }
    void comb(int p, String s, String digits){
        if (p == digits.length()){
            list.add(s);
            return;
        }
        String d = letter(digits.charAt(p));
        p++;
        for (char ch: d.toCharArray()){
            comb(p, s+ch, digits);
        }

    }
    String letter(char c){
        switch(c){
            case '2':
                return "abc";
            case '3':
                return "def";
            case '4':
                return "ghi";
            case '5':
                return "jkl";
            case '6':
                return "mno";
            case '7':
                return "pqrs";
            case '8':
                return "tuv";
            case '9':
                return "wxyz";
        }
        return "";
    }
}
