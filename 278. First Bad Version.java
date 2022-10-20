/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int a = 2, b = n, mid;
        while (a <= b) {
            mid = a + (b - a) / 2;
            if (isBadVersion(mid) == true){
                if(isBadVersion(mid - 1) == false) 
                    return mid;
                else
                    b = mid - 1;
            }
            else
                a = mid + 1;
        }
        return b;
    }
}
