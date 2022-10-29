class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> count = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++){
            if (count.put(nums[i], 1) != null)
                return true;
        }
        return false;
    }
}
