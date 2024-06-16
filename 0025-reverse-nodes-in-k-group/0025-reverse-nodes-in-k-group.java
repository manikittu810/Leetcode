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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head ==null || k==1){
            return head;
        }

        int count = 0;
        ListNode node = head;
        while(node!=null){
            count++;
            node = node.next;
        }

        ListNode dummy =new ListNode(-1);
        dummy.next = head;
        ListNode sptr =dummy,eptr =dummy;

        while(count>=k){
            sptr = eptr.next;
            ListNode cur = sptr.next;
            for(int i=1;i<k;i++){
                sptr.next = cur.next;
                cur.next = eptr.next;
                eptr.next = cur;
                cur = sptr.next;
            }
            eptr = sptr;
            count-=k;
        }
        return dummy.next;
    }
}