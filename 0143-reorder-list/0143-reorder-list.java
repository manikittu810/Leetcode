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
        if(head == null||head.next ==null){
            return ;
        }
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
       
        ListNode secondList =  reverse(slow.next);
        slow.next =null;
        ListNode firstList = head;

        while(firstList!=null &&secondList!=null){
            ListNode temp = firstList.next;
            ListNode temp2 =  secondList.next;
            firstList.next = new ListNode(secondList.val);
            firstList = firstList.next;
            firstList.next = temp;
            firstList = firstList.next;
            secondList = temp2;


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