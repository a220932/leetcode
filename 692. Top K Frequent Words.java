class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (String word : words) {
            if (map.get(word) == null){
                map.put(word, 1);
            }
            else
                map.put(word, map.get(word) + 1);
        }
        
        String[] r = new String[k];
        int least = 0;
        int next = 0;
        for (String key : map.keySet()) {
            int val = map.get(key);
            if (val >= least) {
                int p = next;
                int i = next - 1;
                while (i >= 0 && val > map.get(r[i]))
                    p = i--;
                while (i >= 0 && val == map.get(r[i]) && compAlph(key, r[i]))
                    p = i--;
                
                if (p < k)
                    insert(r, key, k, p);
                if (next == k)
                    least = map.get(r[k - 1]);
                else
                    next++;
            }   
        }
        return Arrays.asList(r);
    }
    public void insert (String[] r, String key, int k, int p){
        String temp;
        for (int i = p; i < k; i++) {
            temp = r[i];
            r[i] = key;
            key = temp;
        }
    }
    public boolean compAlph (String a, String b){
        for (int i = 0; i < a.length(); i++) {
            if (i >= b.length())
                return false;
            if (a.charAt(i) == b.charAt(i))
                continue;
            if (a.charAt(i) < b.charAt(i))
                return true;
            else
                return false;
        }
        return true;
    }
}
