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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode ptr = dummy;
        int len = 0;
        for(ListNode cur = head;cur!=null;cur = cur.next){
            len++;
        }
        int target = len - n;
        for(int i=0;i<target;i++){
            ptr = ptr.next;
        }
        ptr.next = ptr.next.next;
        return dummy.next;
    }
}