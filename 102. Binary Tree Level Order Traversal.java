/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> sub = new LinkedList<List<Integer>>();
        
        if (root == null)
            return sub;
        
        List<Integer> lv0 = new LinkedList<Integer>();
        lv0.add(root.val);
        sub.add(lv0);
        if(root.left == null && root.right == null)
            return sub;
        
        if (root.left != null){
            List<List<Integer>> lsub = levelOrder(root.left);
            sub.addAll(lsub);
        }
        if (root.right != null){
            List<List<Integer>> rsub = levelOrder(root.right);
            if(root.left == null)
                sub.addAll(rsub);
            else{
                for (int i = 0; i < rsub.size(); i++){
                    if(i + 1 < sub.size()){
                        sub.get(i + 1).addAll(rsub.get(i));
                    }
                    else
                        sub.add(rsub.get(i));
                }
            }
        }
        return sub;
    }
}
