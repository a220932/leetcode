class Solution {//Boyer-Moore Voting Algorithm
    public int majorityElement(int[] nums) {
        Integer M = null;
        int count = 0;
        for (int i : nums){
            if (count == 0)
                M = i;
            count += (M == i)? 1 : -1;
        }
        return M;
    }
}
