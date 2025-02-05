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
            return ;
        }
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode list2 = reverse(slow.next);
        slow.next=null;
        ListNode list1 = head;
        while(list1!=null && list2!=null){
            ListNode temp = list1.next;
            ListNode temp2 = list2.next;

            list1.next = list2;
            list1 = list1.next;
            list1.next = temp;
            list1 = list1.next;
            list2 = temp2;
        }

    }
    private ListNode reverse(ListNode head){
        if(head ==null){
            return null;
        }
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