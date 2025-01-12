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
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null){
            return true;
        }

        ListNode dummy1 = new ListNode(-1);
        ListNode dummy2 = new ListNode(-1);
        ListNode first1 = dummy1;
        ListNode second1 = dummy2;

        int count = 0;

        for(ListNode cur = head ; cur!=null ;cur=cur.next){
            count++;
        }

        ListNode cur = head;

        for(int i=0;i<count/2;i++){
            first1.next = new ListNode(cur.val);
            first1 = first1.next;
            cur = cur.next;
        }

        if(count%2!=0){
            cur = cur.next;
        }

        while(cur!=null){
            ListNode temp  = new ListNode(cur.val);
            temp.next = dummy2.next;
            dummy2.next = temp;
            cur = cur.next;
        }
        ListNode first = dummy1.next;
        ListNode second = dummy2.next;
        while(first!=null && second!=null){
            if(first.val!=second.val){
                return false;
            }
            first = first.next;
            second = second.next;
        }
return true;
    }
}