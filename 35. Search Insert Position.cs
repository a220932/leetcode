public class Solution {
    public int SearchInsert(int[] nums, int target) {
        int l = 0, h = nums.Length, p = 0;
        while(l<h){
            p = (l+h)/2;
            if(nums[p] == target)return p;
            
            if(nums[p] < target)l = ++p;
            else h = p;
        }
        return p;
    }
}
