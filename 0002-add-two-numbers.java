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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        //Edge cases not needed since at least one input
        ListNode head = new ListNode(0);
        ListNode dummyHead = head;
        int carry = 0;
        
        while (l1 != null || l2 != null) {
            //check for null values, else val = l.val
            int val1 = (l1 == null) ? 0 : l1.val;
            int val2 = (l2 == null) ? 0 : l2.val;
            
            int sum = val1 + val2 + carry;
            carry = sum / 10;
            sum = sum % 10;
            
            dummyHead.next = new ListNode(sum);
            dummyHead = dummyHead.next;
            
            //loop through
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
            
        }
        
        
        if(carry > 0) dummyHead.next = new ListNode(carry);
        
        return head.next;
        
    }
}