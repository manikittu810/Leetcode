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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        

        if(l1==null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }
        ListNode cur = new ListNode(-1);
        ListNode dummy = cur;
        int carry = 0;
        while(l1!=null || l2!=null){
            int val1 = (l1!=null) ? l1.val : 0;
            int val2 = (l2!=null) ? l2.val : 0;
            int sum = val1+val2+carry;
            carry = sum/10;
            int addToList = sum%10;
            dummy.next = new ListNode(addToList);
            dummy = dummy.next;
            if(l1!=null) l1=l1.next;
            if(l2!=null) l2 = l2.next;
        }
        if(carry!=0){
            dummy.next = new ListNode(carry);
        }

        return cur.next;
    }
}