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
    public ListNode sortList(ListNode head) {
        ListNode st = new ListNode(0, null);
        ListNode i = head;
        while (i != null){
            ListNode n = i.next;
            ListNode p = st;
            while (p.next != null){
                if (i.val < p.next.val)
                    break;
                p = p.next;
            }
            i.next = p.next;
            p.next = i;
            i = n;
        }
        return st.next;
        
    }
}
