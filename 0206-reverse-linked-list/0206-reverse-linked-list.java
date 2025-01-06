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
    public ListNode reverseList(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode cur = head;
        ListNode prev = null;
        ListNode Next = null;
        while(cur!= null){
            Next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = Next;
           

        }
        return prev;
    }
}
/*
null<-Node(prev) Node(Next)(cur)-> Node->null 
*/