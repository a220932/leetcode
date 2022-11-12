class Solution {
    public List<List<Integer>> threeSum(int[] nums) {        
        List<List<Integer>> L = new LinkedList<List<Integer>>();
        Arrays.sort(nums);
        Integer a = null, b = null, c = null;
        int l = nums.length;
        for (int i = 0; i < l; i++){
            if (a != null && a == nums[i])
                continue;
            a = nums[i];
            for (int j = i + 1; j < l; j++){
                if (b != null && b == nums[j])
                    continue;
                b = nums[j];
                for (int k = l - 1; k > j; k--){
                    c = nums[k];
                    if (a + b + c == 0){
                        List<Integer> list = new LinkedList<Integer>();
                        list.add(a);
                        list.add(b);
                        list.add(c);
                        L.add(list);
                        break;
                    }
                }
            }
            
        }
        
        return L;
    }
}
