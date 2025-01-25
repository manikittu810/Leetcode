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

        if(head == null || k==1){
            return head;
        }

       

        int count = 0;

        for(ListNode i = head;i!=null;i=i.next){
            count++;
        }

        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        
        ListNode prev=dummy,Next=dummy,cur=dummy;

        while(count>=k){
            
            cur = prev.next;
            Next = cur.next;

            for(int i=1;i<k;i++){
                cur.next = Next.next;
                Next.next = prev.next;
                prev.next = Next;
                Next = cur.next;
            }
            prev = cur;
            count-=k;
        }
        return dummy.next;
    }
}