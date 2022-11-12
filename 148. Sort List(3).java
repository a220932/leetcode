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
        if (head == null || head.next == null) return head;//[] [0]
        
        ListNode mid = head;
        for (ListNode fast = head.next; fast != null && fast.next != null; fast = fast.next.next)
            mid = mid.next;
        
        ListNode sec = sortList(mid.next);
        
        mid.next = null;
        head = sortList(head);
        
        return merge(head, sec);
    }
    public ListNode merge(ListNode a, ListNode b) {
        ListNode st = new ListNode(0, null), i = st;
        ListNode s = a, t = b;
        while (s != null || t != null){
            if ((t != null) && (s == null || t.val < s.val)){
                i.next = t;
                i = i.next;
                t = t.next; 
            }
            if ((s != null) && (t == null || s.val <= t.val)){
                i.next = s;
                i = i.next;
                s = s.next; 
            }
        }
        i.next = null;
        return st.next;
    }
}
