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
    public boolean isBalanced(TreeNode root) {
        return (height(root) != null);
    }

    
    Integer height(TreeNode root) {
        if (root == null)
            return 0;
        if (root.left == null && root.right == null)
            return 1;
        Integer l = height(root.left);
        Integer r = height(root.right);
        if (l == null || r == null)
            return null;
        if (l - r > 1 || r - l > 1)
            return null;
        return 1 + ((l > r)? l : r);
    }
}
