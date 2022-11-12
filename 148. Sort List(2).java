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
        if (head == null || head.next == null) return head;
        ListNode left = new ListNode(0, null), l = left;
        ListNode right = new ListNode(1, null), r = right;
        ListNode p = head;
        ListNode i = p.next;
        while (i != null){
            ListNode n = i.next;
            if (i.val < p.val){
                l.next = i;
                l = i;
            }
            else{
                r.next = i;
                r = i;
            }
            i.next = null;
            i = n;
        }
        p.next = sortList(right.next);
        
        head = sortList(left.next);
        if (head == null)
            return p;
        l = head;
        
        while (l.next != null)l = l.next;
        
        l.next = p;
        
        return head;
    }
}
