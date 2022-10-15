class Solution {
    public void rotate(int[] nums, int k) {
        int l = nums.length;
        int[] t = new int[l];
                
        int i = 0;
        while(i < l){
            k %= l;
            t[k++] = nums[i++];
        }
        for(i = 0; i < l; i++){
            nums[i] = t[i];
        }
    }
}
