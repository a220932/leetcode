class Solution {
    public int jump(int[] nums) {
        int p = nums.length-1;
        int step = 0;
        while (p != 0){
            for (int i = 0; i < p; i++){
                if (p <= i + nums[i]){
                    p = i;
                    break;
                }
            }
            step++;
        }
        return step;
    }
}
