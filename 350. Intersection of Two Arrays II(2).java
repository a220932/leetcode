class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums1.length;i++){
            map.put(nums1[i], map.getOrDefault(nums1[i], 0) + 1);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums2.length;i++){
            if (map.getOrDefault(nums2[i], 0) > 0){
                map.put(nums2[i], map.getOrDefault(nums2[i], 1) - 1);
                list.add(nums2[i]);
            }
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
