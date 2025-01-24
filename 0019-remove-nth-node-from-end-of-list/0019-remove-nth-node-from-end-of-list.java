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
        ListNode cur = dummy;
        int count = 0;
        for(ListNode i =dummy.next;i!=null;i=i.next){
            count++;
        }

        int target = count-n;
        for(int i =0;i<target;i++){
            cur = cur.next;
        }
        cur.next = cur.next.next;
        return dummy.next;
    }
}