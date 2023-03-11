class Solution {
    public boolean canJump(int[] nums) {
        int max = 0;
        for (int i = 0; max < nums.length-1 ; i++){
            if(i > max)
                return false;
            if (i + nums[i] > max)
                max = i + nums[i];
        }
        return true;
    }
}
