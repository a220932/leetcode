class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p = m - 1, q = n - 1, r = m + n - 1;
        for (; r >= 0; r--){
            if(q < 0 && p >= 0)
                nums1[r] = nums1[p--];
            else if(p < 0 && q >= 0)
                nums1[r] = nums2[q--];
            else if (nums1[p] > nums2[q])
                nums1[r] = nums1[p--];
            else
                nums1[r] = nums2[q--];
        }
    }
}
