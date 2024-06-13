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
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }

        ListNode res = new ListNode(-1);
        ListNode tail = res;

        ListNode cur1  = l1;
        ListNode cur2 = l2;

        int carry = 0;
        
        while(cur1!=null || cur2!=null || carry!=0){
            int val1 = (cur1!=null) ? cur1.val : 0;
            int val2 = (cur2!=null) ? cur2.val : 0;
            int sum = carry+val1+val2;
            carry = sum/10;
            tail.next = new ListNode(sum%10);
            tail =tail.next;
            if(cur1!=null){
                cur1 =cur1.next;
            }
            if(cur2!=null){
                cur2 =cur2.next;
            }
        }
    return res.next;

    }
}