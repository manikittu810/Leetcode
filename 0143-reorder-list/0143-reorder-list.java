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

        if(head == null||head.next==null){
            return ;
        }
        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
         ListNode secondHalf = reverse(slow.next);
        slow.next = null; // Split the list into two halves
        ListNode firstHalf = head;

        while(secondHalf!= null){
            ListNode tempfirstHalfval = firstHalf.next;
            ListNode tempSecondHalfval = secondHalf.next;

            firstHalf.next = secondHalf;
            secondHalf.next = tempfirstHalfval;

            firstHalf = tempfirstHalfval;
            secondHalf = tempSecondHalfval;

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
/*

1 2 3 4 t1
1 2 3 4 5 t2

dummyNode = -1;

hare and tortoise algorithm 
slow pointer we gonna get the middle of LL
123
45 -> reverse this  5 4
l1.next = new ListNode(l2.val);
l1.next and l2.next 
1 2
 3 4 -> reverse this -> 4 3
*/