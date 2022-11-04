class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length())
            return false;
        int[] count = new int[256];
        int c = 0;
        for (int i = 0; i < ransomNote.length(); i++)
            if (count[ransomNote.charAt(i)]++ == 0)
                c++;
        for (int i = 0; i < magazine.length(); i++)
            if (--count[magazine.charAt(i)] == 0)
                if (--c == 0)
                    return true;
        return false;
    }
}
