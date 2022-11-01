class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map1 = new HashMap<Integer, Integer>();
        Map<Integer, Integer> map2 = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums1.length;i++){
            map1.put(nums1[i], map1.getOrDefault(nums1[i], 0) + 1);
        }
        for (int i = 0; i < nums2.length;i++){
            map2.put(nums2[i], map2.getOrDefault(nums2[i], 0) + 1);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int key : map1.keySet()){
            int t = Math.min(map1.get(key), map2.getOrDefault(key, 0));
            for (; t > 0; t--)
                list.add(key);
        }
        return toIntArray(list);
    }
    public int[] toIntArray(List<Integer> list) {
        int[] ret = new int[list.size()];
        for(int i = 0; i < ret.length; i++)
            ret[i] = list.get(i);
        return ret;
    }
}
