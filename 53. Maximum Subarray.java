class Solution {
    public int maxSubArray(int[] nums) {
    
        int max = nums[0];
        int p = 1;
        for (; p < nums.length; p++){
            nums[p] += Math.max(nums[p - 1], 0); 
            max = Math.max(nums[p], max);
        }
        return max;
    }
}
