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
        if(head == null){return ;}

        int count = 0;
        for(ListNode cur=head;cur!=null;cur=cur.next){
            count++;
        }
        ListNode cur=head;
        for(int i=0;i<count/2;i++){
            cur=cur.next;
        }
        ListNode secondList = reverse(cur.next);
        cur.next = null;
        ListNode firstList = head;
        while(firstList!=null && secondList!=null){
            ListNode temp = firstList.next;
            firstList.next = secondList;
            firstList=firstList.next;
            secondList=secondList.next;
            firstList.next = temp;
            firstList=firstList.next;
        }
    }
    private ListNode reverse(ListNode head){
        if(head == null){
            return head;
        }
        ListNode prev = null;
        ListNode Next = null;
        ListNode cur = head;
        while(cur!=null){
            Next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = Next;
        }
        return prev;
    }
}