/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     public int val;
 *     public ListNode next;
 *     public ListNode(int val=0, ListNode next=null) {
 *         this.val = val;
 *         this.next = next;
 *     }
 * }
 */
public class Solution {
    public ListNode AddTwoNumbers(ListNode l1, ListNode l2) {
        ListNode r = l1, r1 = l1, r2 = l2;
        do{
            if(r2!=null){
                r1.val += r2.val;
                r2=r2.next;
            }
            if(r1.val / 10 != 0){
                if(r1.next == null)
                    r1.next = new ListNode(0, null);
                r1.next.val += r1.val / 10;
                r1.val %= 10;
            }
            
            
           
            if(r1.next==null && r2 != null){
            r1.next = new ListNode(0, null);
            }

            r1 = r1.next;
        }while(r1 != null);

        return r;
    }
}
