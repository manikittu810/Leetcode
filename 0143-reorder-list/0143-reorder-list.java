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
    public void reorderList(ListNode head) {
        if(head ==null){return ;}
        int count = 0;
        for(ListNode cur = head;cur!=null; cur=cur.next){
            count++;
        }
        ListNode sptr = head;
        for(int i =0;i<count/2;i++){
            sptr = sptr.next;
        } 
        ListNode secondHalf = reverse(sptr.next);
        sptr.next = null;
        ListNode firstHalf = head;
        while(firstHalf !=null && secondHalf!=null){
            ListNode temp1 = firstHalf.next;
            firstHalf.next = secondHalf;
            firstHalf = firstHalf.next ;
            secondHalf = secondHalf.next;
            firstHalf.next = temp1;
            firstHalf = firstHalf.next;

        }
    }
    public ListNode reverse(ListNode head){
        if(head == null){return null;}
        ListNode cur = head;
        ListNode Next = null;
        ListNode prev = null;
        while(cur!=null)
        {
            Next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = Next;
        }
        return prev;

    }
}