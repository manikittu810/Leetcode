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
        if(head == null){
            return head;
        }
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode fptr = dummy;

        for(int i=0;i<n;i++){
            fptr = fptr.next;//1->2->fptr
        }

        ListNode sptr = dummy;

        while(fptr.next!=null){
            sptr = sptr.next;//1 2 3
            fptr= fptr.next;//3 4 5
        }
        sptr.next = sptr.next.next;
        return dummy.next;
    }
}
