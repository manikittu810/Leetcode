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
    public ListNode mergeTwoLists(ListNode cur1, ListNode cur2) {
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        while(cur1!=null && cur2!= null){
            if(cur1.val<=cur2.val){
                temp.next = cur1;
                cur1 = cur1.next;
            }
            else{
                temp.next = cur2;
                cur2 = cur2.next;
            }
            temp = temp.next;
        }
        if(cur1!=null && cur2==null){
            temp.next = cur1;
        }else if(cur2!=null && cur1==null){
            temp.next = cur2;
        }
return dummy.next;
    }
}