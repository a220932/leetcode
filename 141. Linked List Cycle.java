/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode n = head, nn = head;
        while (n != null && nn != null){
            if (nn.next == null)
                break;
            n = n.next;
            nn = nn.next.next;
            if (n == nn && n != null)
                return true;
        }
        return false;
    }
}
