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
        if(lists.length == 0){
            return null;
        }

        PriorityQueue<ListNode> minHeap = new PriorityQueue<>((b,c) -> b.val - c.val);

        for(ListNode node : lists){
            if(node!=null){
            minHeap.offer(node);
            }
        }

        ListNode dummy = new ListNode(-1);
        ListNode cur = dummy;

        while(!minHeap.isEmpty()){
            ListNode polledNode = minHeap.poll();
            cur.next = polledNode;
            // polledNode : 1->4->5 
            // (-1)-> polledNode; (-1)->1->4->5
            //moved Polled Node's head;
            cur= cur.next ;
            polledNode = polledNode.next;
            if(polledNode!=null){
                minHeap.offer(polledNode);
            }
        }
        return dummy.next;
    }
}