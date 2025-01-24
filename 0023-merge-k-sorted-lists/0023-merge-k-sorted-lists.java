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
        List<Integer> l = new ArrayList<>();
        for(ListNode node : lists){
            ListNode cur = node;
            while(cur!=null){
                l.add(cur.val);
                cur= cur.next;
            }
        }
        Collections.sort(l);

    ListNode newHead = new ListNode(-1);
    ListNode dummy = newHead;
        for(int i=0;i<l.size();i++){
            dummy.next = new ListNode(l.get(i));
            dummy= dummy.next;
        }

return newHead.next;
    }
}