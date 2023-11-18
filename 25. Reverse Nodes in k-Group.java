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
    public ListNode reverseKGroup(ListNode head, int k) {
        if (k == 1)
            return head;

        ListNode N = head;
        for (int i = 0; i < k; i++){
            if (N == null)
                return head;
            N = N.next;
        }

        ListNode H = head;
        H = reverse(H, k, reverseKGroup(N, k));

        return H;

    }

    public ListNode reverse(ListNode head, int k, ListNode tail) {
        if (k == 1){
            head.next = tail;
            return head;
        }
        ListNode P = head.next;
        head.next = tail;
        
        return reverse(P, k-1, head);
    }


}
