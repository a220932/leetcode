class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        int[] step = new int[n];
        step[0] = 0;
        for (int i = 1; i < n; i++){
            step[i] = -1;
        }
        for (int p = 0; p < n-1; p++){
            int l = nums[p];
            int s = step[p] + 1;
            for(int i = 1; i <= l; i++){
                if (p+i >= n)
                    break;
                if (step[p+i] == -1 || step[p+i] > s)
                    step[p+i] = s;
            }
        }  
        return step[n-1];
    }
}
