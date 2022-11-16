class Solution {
    public void sortColors(int[] nums) {
        int l = nums.length;
        int c1 = 0;
        int p = 0;
        for (int i = 0; i < l; i++){
            if (nums[i] == 1)
                c1++;
            else if (nums[i] == 0)
                nums[p++] = 0;
        }
        for (int i = 0; i < c1; i++){
            nums[p++] = 1;
        }
        while (p < l)
            nums[p++] = 2;
    }
}
