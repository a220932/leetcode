class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> count = new HashMap<Integer, Integer>();
        int t = nums.length / 2;
        for (int i : nums){
            count.put(i, count.getOrDefault(i, 0) + 1);
            if (count.get(i) > t)
                return i;
        }
        return 0;
    }
}
