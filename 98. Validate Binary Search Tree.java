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
    public boolean isValidBST(TreeNode root) {
        return isBST(root, null, null);
    }
    public boolean isBST(TreeNode root, TreeNode lb, TreeNode hb) {
        if (root == null)
            return true;
        
        if (lb != null)
            if (!(lb.val < root.val))return false;
        if (hb != null)
            if(!(root.val < hb.val))return false;
        
        if (root.left != null)
            if (!isBST(root.left, lb, root)) return false;
        if (root.right != null)
            if (!isBST(root.right, root, hb)) return false;
        
        return true;
    }
    
    
}
