/* The isBadVersion API is defined in the parent class VersionControl.
      bool IsBadVersion(int version); */

public class Solution : VersionControl {
    public int FirstBadVersion(int n) {
        int  l = 1, h = n, p = (n-1)/2 + 1;
        while(l<h){
            if(IsBadVersion(p)){
                h = p;
            }
            else{
                l = p+1;
            }
            p = l/2+h/2;
        }
        return h;
    }
}
