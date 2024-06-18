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
    public ListNode reverseList(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode prev = null;
        ListNode cur = head;
        ListNode nuxt = null;

        while(cur!=null){
            nuxt = cur.next;
            cur.next =prev;
            prev =cur;
            cur=nuxt;
        }
        return prev;
        
    }
}