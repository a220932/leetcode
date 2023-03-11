class Solution {
    public int jump(int[] nums) {
        int m = nums.length-1;
        if (m == 0)return 0;
        int p = 0;
        int f = nums[0];//+p
        int step = 1;
        while (f < m){
            step++;
            int max = f;
            for (int i = p; i <=  f; i++){
                if (i + nums[i] >= max){
                    p = i;
                    max = i + nums[i];
                }
            }
            f = max;
        }
        return step;
    }
}
