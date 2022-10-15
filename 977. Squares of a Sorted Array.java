class Solution {
    public int[] sortedSquares(int[] nums) {
        int l = nums.length;
        int p = 0;
        for(int i = 0; i < l; i++){
            nums[i] *= nums[i];
            if(nums[p] > nums[i])p = i;
        }
        
        int[] a = new int[l];
        
        int lef = p-1, rig = p+1;
        for(int i = 0; i < l; i++){
            a[i] = nums[p];
            
            if(rig >= l)p = lef--;
            else if(lef < 0)p = rig++;
            else if(nums[lef] < nums[rig])p = lef--;
            else p = rig++;
        }
        return a;
    }
}
