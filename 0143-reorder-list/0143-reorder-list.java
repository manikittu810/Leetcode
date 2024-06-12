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
        if(head == null || head.next == null ){
            return;
        }
        ListNode sptr =head;
        ListNode fptr = head;


        while(fptr!=null && fptr.next!=null){
            sptr=sptr.next;
            fptr=fptr.next.next;
        }


        ListNode secondHalf = reverse(sptr.next);
        sptr.next =null; 

        ListNode cur = head;
        while(secondHalf != null){
            ListNode curTempNode = cur.next;
            ListNode secondHalfTempNode = secondHalf.next;

            cur.next = secondHalf;
            secondHalf.next = curTempNode;

            cur = curTempNode;
            secondHalf = secondHalfTempNode;
        }
    }
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode cur =head;
        ListNode nuxt = null;
        while(cur!=null){
            nuxt = cur.next;
            cur.next = prev;
            prev =cur;
            cur =nuxt;
        }
        head =prev;
        return head;
    }
}