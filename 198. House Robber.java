class Solution {
    public int rob(int[] nums) {
        int len = nums.length;
        if (len == 0) return 0;
        if (len == 1) return nums[0];

        int[][] rob = new int[len][2];
        rob[0][1] = nums[0];
        
        rob[1][0] = rob[0][1];
        rob[1][1] = nums[1];

        for (int i = 2; i < len; i++){
            rob[i][0] = max(rob[i-1][0], rob[i-1][1]);
            rob[i][1] = max(rob[i-1][0], rob[i-2][1]) + nums[i];

        }
        return max(rob[len - 1][0], rob[len - 1][1]);
    }
    public int max(int a, int b){
        if (a > b)return a;
        return b;
    }
}
