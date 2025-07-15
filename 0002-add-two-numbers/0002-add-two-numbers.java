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
    public ListNode addTwoNumbers(ListNode list1, ListNode list2) {
        if(list1==null){
            return list2;
        }
        if(list2==null){
            return list1;
        }

        int carry = 0;

        ListNode dummy = new ListNode(-1);

        ListNode cur = dummy;

        while(list1!=null || list2!=null){
            int a = (list1!=null) ? list1.val : 0;
            int b = (list2!=null) ? list2.val : 0;

            int sum = a+b+carry;
            carry = sum/10;
            int numberToStore = sum%10;
            System.out.println(numberToStore);
            dummy.next = new ListNode(numberToStore);
            dummy = dummy.next;
            if(list1!=null){
                list1=list1.next;
            }
            if(list2!=null){
                list2=list2.next;
            }
        }
        if(carry!=0){
            dummy.next= new ListNode(carry);
        }
        return cur.next;
    }
}