class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length, a = 0, b = n-1;
        while (a < n && nums[a] != target)a++;
        while (b >= 0 && nums[b] != target)b--;
        int[] arr = {(b == -1)?b:a, b}; 
        return arr;
        
    }
}
