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
        if(l1==null && l2 == null ){
            return null;
        }
        if(l1==null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }

        ListNode addList = new ListNode(-1);
        ListNode dummy  =  addList;

        ListNode cur1 = l1;
        ListNode cur2 = l2;
        int carry = 0;

        while(cur1!=null || cur2!=null || carry!=0){

            int val1 = (cur1!=null) ? cur1.val : 0;
            int val2 = (cur2!=null) ? cur2.val :0;
            int n = val1+val2+carry;
            System.out.println("n :" + n );
            carry=n/10;//10/10==1
            System.out.println("Carry :" + carry);
            int addToList = n%10;//7%10=7
            System.out.println("addToList :" + addToList);
            dummy.next = new ListNode(addToList);
            if(cur1!=null) cur1 = cur1.next;
            if(cur2!=null) cur2 = cur2.next;
            dummy = dummy.next;
        }
        
return addList.next;
    }
}