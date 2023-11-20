class Solution {
    public int hIndex(int[] citations) {
        int[] count = new int[1001];
        Arrays.fill(count, 0);
        
        int h = 0;
        for (int k : citations){
            count[k]++;
            if (k > h)
                h = k;
        }
        int c = 0;
        for (; h >= 0; h--){
            c += count[h];
            if (c >= h)
                return h;
        }
        return -1;
    }
}
