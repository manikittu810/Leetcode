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
        if(head == null || head.next == null){
            return;
        }

        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }


        ListNode list2 = reverse(slow.next);

        slow.next = null;

        ListNode list1 = head;

        while(list1!=null && list2!=null){

            ListNode temp1 = list1.next;


            list1.next = new ListNode(list2.val);

            list1 = list1.next;

            list1.next = temp1;//list1 is at 5 

            list1 = temp1;//list1 at 2 


            list2 = list2.next;

    }
    }
    private ListNode reverse(ListNode head){

        ListNode cur = head;
        ListNode Next = null;
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