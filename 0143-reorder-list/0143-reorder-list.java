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
        if(head == null){
            return ;
        }
        int count =0;
        for(ListNode c = head;c!=null;c=c.next){
            count++;
        }
        ListNode slow = head;
        for(int i=0;i<count/2;i++){
            slow = slow.next;
        }
       
        ListNode secondList =  reverse(slow.next);
        slow.next =null;
        ListNode firstList = head;

        while(firstList!=null &&secondList!=null){
            ListNode temp = firstList.next;
            ListNode temp2 =  secondList.next;
            firstList.next = secondList;
            firstList = firstList.next;
            secondList = secondList.next;
            firstList.next = temp;
            // secondList.next = temp2;
            firstList = firstList.next;
            // secondList = secondList.next;
            
        }
    }
    private ListNode reverse(ListNode head){
        if(head == null){
            return null;
        }
        ListNode Next = null;
        ListNode cur = head;
        ListNode prev = null;
        while(cur!=null){
            Next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = Next;
        }
        return prev;
    }
}