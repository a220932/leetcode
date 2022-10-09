public class Solution {
    public double FindMedianSortedArrays(int[] nums1, int[] nums2) {
        int l1 = nums1.Length;
        int l2 = nums2.Length;
        
        int p1 = (l1+l2)/2;
        int p2 = p1+1;
        if((l1+l2) % 2 != 0)p1++;
        bool f1 = true, f2 = true;
        double n1 = 0, n2 = 0;
        for(int i = 1, j=0, k=0; f1||f2; i++){
            int n = 0;
            if(j<l1 && k<l2){
                if(nums1[j] < nums2[k]){
                    n = nums1[j];
                    j++;
                }
                else{
                    n = nums2[k];
                    k++;
                }
                
            }
            else{
                if(j<l1){
                    n = nums1[j];
                    j++;
                }
                else{
                    n = nums2[k];
                    k++;
                }
            
            }
            
            
            if(i == p1){
                n1 = n;
                f1 = false;
            }
            if(i == p2){
                n2 = n;
                f2 = false;
            }
        }
        return (n1+n2)/2;
    }
}
