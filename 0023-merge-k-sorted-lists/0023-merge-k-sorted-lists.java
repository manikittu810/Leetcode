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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0){
            return null;
        }
        ListNode dummy = new ListNode(-1);
        ListNode cur = dummy;
        PriorityQueue<ListNode> pq = new PriorityQueue<>((b,c) -> b.val-c.val);
        for(ListNode head : lists){
            if(head!=null){
            pq.offer(head);
            }
        }

        while(!pq.isEmpty()){
            ListNode head = pq.poll();
            cur.next = head;
            head = head.next;
            cur = cur.next;
            if(head!=null){
            pq.offer(head);
            }
        } 
        return dummy.next;
    }
}