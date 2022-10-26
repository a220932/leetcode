class Solution {
    public List<List<Integer>> permute(int[] nums) {
        if (nums.length == 0){
            List<List<Integer>> LL = new LinkedList<List<Integer>>();
            return LL;
        }
        
        return permutation(nums, 0);
    }
    public void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }

    public List<List<Integer>> permutation(int[] nums, int p) {
        List<List<Integer>> LL = new LinkedList<List<Integer>>();
        if (p == nums.length) {
            LL.add(Arrays.stream(nums).boxed().toList());
            return LL;
        }
        for (int j = p; j < nums.length; j++){
            swap(nums, p, j);
            LL.addAll(permutation(nums.clone(), p + 1));
        }
        return LL;
    }
}
