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
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> k = new Stack<Integer>();
        ListNode p1 = head, p2 = head;
        while (p2 != null){
            k.push(p1.val);
            
            p1 = p1.next;
            if (p2.next == null){
                k.pop();               
                break;
            }
            p2 = p2.next.next;
        }
        while (p1 != null){
            if (p1.val != k.pop())
                return false;
            p1 = p1.next;
        }
        return true;
    }
}
