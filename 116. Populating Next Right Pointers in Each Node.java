/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    HashMap<Integer, Node> near = new HashMap<Integer, Node>();
    int lev = 0;
    public Node connect(Node root) {
        if (root == null) return null;
        
        root.next = near.put(lev++, root);
        
        int temp = lev;
        if (root.right != null)
            connect(root.right);
        
        lev = temp;
        if (root.left != null)
            connect(root.left);
        
        return root;
    }
}
