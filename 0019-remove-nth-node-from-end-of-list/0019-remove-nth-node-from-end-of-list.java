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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head ==null){
            return null;
        }
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        
        ListNode ptr = dummy;
        for(int i=0;i<n;i++){
            ptr=ptr.next;
        }
        ListNode ptr2 = dummy;
        while(ptr.next!=null){
            ptr=ptr.next;
            ptr2=ptr2.next;
        }
        ptr2.next = ptr2.next.next;
        return dummy.next;
    }
}