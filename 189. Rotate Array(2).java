class Solution {
    public void rotate(int[] nums, int k) {
        int l = nums.length; 
        k %= l;
        reverse(nums, 0, l-k-1);
        reverse(nums, l-k, l-1);
        reverse(nums, 0, l-1);        
    }
    public void reverse(int[] a, int l, int r) {
        int t;
        while(l<r){
            t = a[l];
            a[l++] = a[r];
            a[r--] = t;
        }
    }
}
