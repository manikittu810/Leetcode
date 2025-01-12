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
    public ListNode removeElements(ListNode head, int val) {
        if(head == null){
            return null;
        }
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prev = dummy;
        for(ListNode cur = dummy.next;cur!=null;cur = cur.next){
            if(cur.val!=val){
                prev = cur;
            }
            else{
                prev.next = cur.next;
            }
        }
        prev.next = null;
        return dummy.next;
    }
}