/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (p == q) return p;
        
        if (root.left != null) {
            if (isAncestor(root.left, p) && isAncestor(root.left, q)) 
                return lowestCommonAncestor(root.left, p, q);
        }
        if (root.right != null) {
            if (isAncestor(root.right, p) && isAncestor(root.right, q)) 
                return lowestCommonAncestor(root.right, p, q);
        }
        return root;
    }
    public boolean isAncestor(TreeNode root, TreeNode son) {
        if (root == son) return true;
        if (root.left != null) {
            if (isAncestor(root.left, son)) return true;
        }
        if (root.right != null) {
            if (isAncestor(root.right, son)) return true;
        }
        return false;
    }
}
