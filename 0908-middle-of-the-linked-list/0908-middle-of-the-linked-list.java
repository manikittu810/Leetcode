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
    public ListNode middleNode(ListNode head) {
        int count = 0;
        for(ListNode cur=head;cur!=null;cur =cur.next){
            count++;
        }
        ListNode cur = head;
       
        for(int i=0;i<count/2;i++){
            cur = cur.next;//if count is odd
        }   
        return cur; 
}
}