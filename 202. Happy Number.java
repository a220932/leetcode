class Solution {
    Stack<Integer> st = new Stack<Integer>();
    public boolean isHappy(int n) {
        if (st.search(n) != -1)
            return false;
        st.push(n);
        int m = 0;
        while (n != 0){
            m += (n % 10) * (n % 10);
            n /= 10;
        }
        
        if (m == 1)
            return true;
        return isHappy(m);
    }
}
