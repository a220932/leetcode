public class Solution {
    public int Search(int[] nums, int target) {
        int l = 0, h =  nums.Length - 1;
        while(l<=h){
            int p = (l+h)/2;
            if(nums[p] == target)return p;
            else if(nums[p] < target)l = p+1;
            else h = p-1;
        }
        return -1;
    }
}
