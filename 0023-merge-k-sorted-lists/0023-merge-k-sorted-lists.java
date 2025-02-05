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
        ListNode cur = new ListNode(-1);
        ListNode dummy = cur;
        PriorityQueue<ListNode> minHeap = new PriorityQueue<>((a,b) -> a.val-b.val);

        for(ListNode node : lists){
            if(node!=null){
            minHeap.offer(node);
            }
        }

        while(minHeap.size()>0){

            ListNode node = minHeap.poll();

            dummy.next = node;
            dummy = dummy.next;
            node=node.next;
            if(node!=null){
            minHeap.offer(node);
            }
        }
return cur.next;
    }
}