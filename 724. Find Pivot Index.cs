public class Solution {
    public int PivotIndex(int[] nums) {
        int sum = 0;
        for(int i = 0; i<nums.Length; i++){
            sum += nums[i];
        }
        
        for(int i = 0; i<nums.Length; i++){
            sum -= nums[i];
            if(sum == 0)return i;
            sum -= nums[i];
        }
        return -1;
    }
}
