class Solution {
    public void moveZeroes(int[] nums) { 
        for(int i = 0, p = 0; p < nums.length; i++){
            if(i >= nums.length)
                nums[p++] = 0;
            else if(nums[i] != 0)
                nums[p++] = nums[i];
            
        }
        
        /*
        int p = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0)
                nums[p++] = nums[i];
        }
        while(p < nums.length){
            nums[p++] = 0;
        }
        */
    }
}
