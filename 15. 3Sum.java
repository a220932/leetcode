class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> LL = new LinkedList<List<Integer>>();
        for (int i = 0; i < nums.length; i++) {
            int target = -nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if(nums[j] + nums[k] == target){
                        List<Integer> L = new LinkedList<Integer>();
                        L.add(nums[i]);
                        L.add(nums[j]);
                        L.add(nums[k]);

                        LL.add(L);
                    }
                    if (k + 1 < nums.length)
                        while (nums[k] == nums[k + 1])
                            if (++k + 1 >= nums.length)
                                break;
                }
                if (j + 1 < nums.length)
                    while (nums[j] == nums[j + 1])
                        if (++j + 1 >= nums.length)
                            break;
            }
            if (i + 1 < nums.length)
                while (nums[i] == nums[i + 1])
                    if (++i + 1 >= nums.length)
                        break;
        }
        return LL;
    }
}
