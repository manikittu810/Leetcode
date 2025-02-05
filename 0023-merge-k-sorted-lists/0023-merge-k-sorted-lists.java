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
        ListNode dummy = new ListNode(-1);
        ListNode cur = dummy;
        PriorityQueue<ListNode> minHeap = new PriorityQueue<>((a,b)->a.val-b.val);

        for(ListNode newHead : lists){
            if(newHead!=null){
                minHeap.offer(newHead);
            }
        }
        while(minHeap.size()>0){
            ListNode node = minHeap.poll();
            cur.next = node;
            cur = cur.next;
            node = node.next;
            if(node!=null){
                minHeap.offer(node);
            }

        }
        return dummy.next;
    }
}