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
    public boolean findTarget(TreeNode root, int k) {
        return forPilot(root, k, root);
    }
    public boolean forPilot(TreeNode root, int k, TreeNode p) {
        if (p.left != null)
            if (forPilot(root, k, p.left))
                return true;
        
        if (k != 2 * p.val){
            int target = k - p.val;
            if (searchBST(root, target))
                return true;
        }
            
        if (p.right != null)
            if (forPilot(root, k, p.right))
                return true;
        
        return false;
    }
    public boolean searchBST(TreeNode root, int val) {
        if (root == null)
            return false;
        if (root.val == val)
            return true;
        if (root.val < val)
            return searchBST(root.right, val);
        else
            return searchBST(root.left, val);
    }
}
