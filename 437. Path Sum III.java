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
    int count = 0;
    public int pathSum(TreeNode root, int targetSum) {
        path(root, targetSum, true);
        return count;
    }
    public void path(TreeNode root, long targetSum, boolean b) {
        if (root == null)return;        
        if (targetSum - root.val == 0)
            count++;
        if (b){    
            path(root.left, targetSum, true);
            path(root.right, targetSum, true);
        }
        path(root.left, targetSum - root.val, false);
        path(root.right, targetSum - root.val, false);
        
        return;
    }
}
