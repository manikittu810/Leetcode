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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode newList = new ListNode(-1);
        ListNode dummy = newList;
        ListNode cur1 = list1;
        ListNode cur2 = list2;
        while(cur1!=null && cur2!=null){
            if(cur1.val<=cur2.val){
                dummy.next = new ListNode(cur1.val);
                cur1 = cur1.next;
            }else{
                dummy.next = new ListNode(cur2.val);
                cur2 = cur2.next;
            }
            dummy = dummy.next;
        }

        while(cur1!=null){
            dummy.next = new ListNode(cur1.val);
            cur1 = cur1.next;
            dummy = dummy.next;
        }
        while(cur2!=null){
            dummy.next = new ListNode(cur2.val);
            cur2 = cur2.next;
            dummy = dummy.next;
        }

        return newList.next;
    }
}