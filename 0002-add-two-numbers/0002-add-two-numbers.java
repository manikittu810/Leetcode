class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null){return l2;}
        if(l2==null){return l1;}
        int carry =0;
        ListNode cur = new ListNode(-1);
        ListNode dummy = cur;
        while(l1!=null || l2!=null ){
                int n1 = (l1!=null) ? l1.val : 0;
                int n2 = (l2!=null) ? l2.val : 0;
                int sum  = n1+n2+carry;
                carry = sum/10;//10->1
                int newVal = sum%10;
                dummy.next  = new ListNode(newVal);//node 0 for sum 10
                if(l1!=null) {l1 = l1.next;}
                if(l2!=null) {l2 = l2.next;}
                dummy=dummy.next;
        }
        if(carry!=0){
                dummy.next = new ListNode(carry);
        }
        return cur.next;
    }
}