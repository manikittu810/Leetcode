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
        ListNode cur = head;
        int count = 0;

       for(ListNode i=cur; i!=null;i=i.next){
        count++;
       }

        cur = head;

        ListNode fast = cur;
        ListNode slow = cur;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode list2 = reverse(slow.next);
        slow.next = null;
        cur = head;
        ListNode list1 = cur;

        while(list1!=null && list2!=null){
            ListNode temp = list1.next;
            list1.next = new ListNode(list2.val);
            list1 = list1.next;
            list1.next = temp;
            list1=list1.next;
            list2 = list2.next;
        }
    }

    private ListNode reverse(ListNode node){
        ListNode prev = null;
        ListNode cur = node;
        ListNode Next = null;
        while(cur!=null){
            Next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = Next;
        }
        return prev;
    }
}