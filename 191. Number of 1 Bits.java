public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        if (n == 0) return 0;
        if (n > 0)
            return n % 2 + hammingWeight(n / 2);
        return 1 + hammingWeight((2147483647 + n) + 1);
    }
}
