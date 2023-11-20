class Solution {
    public int removeDuplicates(int[] nums) {
        int counter = 0;
        int hold = nums[0];
        int p = 0;
        for (int k : nums){
            if (k == hold)
                counter++;
            else{
                hold = k;
                counter = 1;
            }

            if (counter < 3)
                nums[p++] = k;
        }
        return p;
    }
}
