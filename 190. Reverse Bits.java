class Solution {
public:
    uint32_t reverseBits(uint32_t n) {
        uint32_t b = 0;
        
        
        
        for (int i = 0; i < 32; i++) {
            b *= 2;
            b += n % 2;
            n /= 2;
        }
        
        
        
        return b;
    }
};
