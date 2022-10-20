class Solution {
    public int search(int[] nums, int target) {
        int a = 0, b = nums.length - 1;
        int mid;
        while (a <= b) {
            mid = (a + b) / 2;
            if (nums[mid] == target) return mid;
            if (nums[mid] < target) 
                a = mid + 1;
            else
                b = mid - 1;
            
        }
        return -1;
    }
}
