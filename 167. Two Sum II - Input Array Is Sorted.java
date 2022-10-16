class Solution {
    public int[] twoSum(int[] numbers, int target) {
        for(int i = 0; i<numbers.length; i++){
            numbers[i] = numbers[i]*2 - target;
            
        }
        int[] p = {1, numbers.length};
        
        for(int sum = Sum(numbers, p); sum != 0; sum = Sum(numbers, p)){
            if(sum > 0)p[1]--;
            else p[0]++;
        }
        return p;
        
        
    }
    public int Sum(int[] numbers, int[] p) {
        return numbers[p[0]-1] + numbers[p[1]-1];
    }
}
