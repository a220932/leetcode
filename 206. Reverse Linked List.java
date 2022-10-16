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
    public ListNode reverseList(ListNode head) {
        return reverse(head, null);
    }
    public ListNode reverse(ListNode head, ListNode tail) {
        if(head == null)return tail;
        ListNode t = new ListNode(head.val, tail);
        return reverse(head.next, t);
    }
}
