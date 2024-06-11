/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null|| head.next==null){
            return false;
        }

        ListNode sptr = head;
        ListNode fptr = head.next;

        while(fptr!=null && fptr.next!=null){
            if(sptr==fptr){
                return true;
            }
            sptr = sptr.next;
            fptr = fptr.next.next;
        }
        return false;
    }
}