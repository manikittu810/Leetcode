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
        Queue<ListNode> minHeap = new PriorityQueue<>((b,c) -> b.val-c.val);

        for(ListNode list : lists){
            if(list!=null){
                minHeap.offer(list);
            }
        }
        ListNode cur = new ListNode(-1);
        ListNode dummy = cur;

        while(!minHeap.isEmpty()){
            ListNode newList = minHeap.poll();//1->3->4
            dummy.next = newList;
            dummy = dummy.next;
            newList= newList.next;
            if(newList!=null){
                minHeap.offer(newList);
            }
        }
        return cur.next;
    }
}