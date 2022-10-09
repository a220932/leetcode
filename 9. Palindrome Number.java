class Solution {
    public boolean isPalindrome(int k) {
        if(k<0)return false;
		if(k/10 == 0){
			return true;
		}
		
		int l = 1;
		for(int kk = k; kk/10 != 0; kk/=10){
			l*=10;
		}
	
		while(k/l == k%10){
            if(k/10 == 0){
                return true;
            }
			k %= l;
            k /= 10;
            l/=100;
            if(l == 0)
                return true;
		}
        return false;
	}	
}
