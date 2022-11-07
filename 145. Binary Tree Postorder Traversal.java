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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> L = new LinkedList<Integer>();
        if (root == null)
            return L;
        L.addAll(postorderTraversal(root.left));
        L.addAll(postorderTraversal(root.right));
        L.add(root.val);
        
        return L;
    }
}
