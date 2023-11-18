/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    int L = 0;
    ListNode H, P, T = null;
    public ListNode swapNodes(ListNode head, int k) {        
        H = new ListNode(0, head);
        find(H, k+1);
        P = H;
        for (int i = 1; i < k; i++){
            P = P.next;
        }
        
        ListNode Q = P.next, R = T.next;
        P.next = R;
        T.next = Q;

        P = Q.next;
        T = R.next;

        R.next = P;
        Q.next = T;

        return H.next;
    }
    boolean find(ListNode P, int k){
        if (P.next != T)
            if(find(P.next, k))
                return true;

        P.next = T;
        T = P;
        L += 1;
        return (L == k);
    }
}
