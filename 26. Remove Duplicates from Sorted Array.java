class Solution {
    public int removeDuplicates(int[] nums) {
        boolean[] exist = new boolean[201];
        Arrays.fill(exist, false);
        int count = 0;
        int p = 0;
        for (int k : nums){
            if(!exist[k+100]){
                exist[k+100] = true;
                nums[p++] = k;
                count++;
            }
        }
        return count;


    }
}
