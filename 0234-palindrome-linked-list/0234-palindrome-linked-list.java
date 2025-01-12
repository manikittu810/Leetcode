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
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null){
            return true;
        }
        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode newList = reverse(slow);
        ListNode dummyList = head;

        while(newList!=null){
            if(newList.val!=dummyList.val){
                return false;
            }else{
                newList= newList.next;
                dummyList = dummyList.next;
            }
        }
return true;

    }
    private ListNode reverse(ListNode head){
        if(head == null){
            return null;
        }
        ListNode prev = null;
        ListNode cur = head;
        ListNode Next = null;
        while(cur!=null){
            Next = cur.next;
            cur.next = prev ;
            prev = cur;
            cur = Next;
        }
        return prev;
    }
}