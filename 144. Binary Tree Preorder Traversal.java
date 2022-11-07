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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> L = new LinkedList<Integer>();
        if (root == null)
            return L;
        L.add(root.val);
        L.addAll(preorderTraversal(root.left));
        L.addAll(preorderTraversal(root.right));
        
        return L;
    }
}c
