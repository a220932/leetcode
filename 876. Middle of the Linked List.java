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
    public ListNode middleNode(ListNode head) {
        int count = lestNode(head)/2;
        while(count > 0){
            head = head.next;
            count--;
        }
        return head;
    }
    public int lestNode(ListNode head) {
        if(head == null)return 0;
        return 1 + lestNode(head.next);
    }
}
