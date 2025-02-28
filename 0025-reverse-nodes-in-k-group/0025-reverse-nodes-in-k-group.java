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
        //Base Case
        if(head == null || k==1){
            return head;
        }
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        int count = 0;

        for(ListNode counter = head;counter!=null;counter = counter.next){
            count++;
        }
        
        ListNode cur = dummy,Next = dummy,prev = dummy;
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