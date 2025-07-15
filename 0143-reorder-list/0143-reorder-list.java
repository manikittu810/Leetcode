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

        for(ListNode cur = head;cur!=null;cur=cur.next){
            count++;
        }
        int limit = 0;

        ListNode ptr = head;
        
        for(int i=0;i<count/2;i++){
            ptr = ptr.next;
        }
        ptr.next = reverse(ptr.next);

        ListNode secondList = ptr.next;//4->3->null

        ptr.next = null;

        ListNode firstList = head;

        while(firstList!=null && secondList!=null){
            ListNode temp = firstList.next;
            firstList.next = secondList;
            firstList = firstList.next;
            secondList= secondList.next;
            firstList.next = temp;
            firstList= firstList.next;
        }
    }
    private ListNode reverse(ListNode head){
        if(head == null){
            return head;
        }
        ListNode Next = null;
        ListNode prev = null;
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