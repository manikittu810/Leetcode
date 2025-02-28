class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
 	ListNode dummy = new ListNode(-1);
	dummy.next = head;
	ListNode fptr = dummy;
	for(int i=0;i<n;i++){
		fptr = fptr.next;
	}       
	ListNode sptr = dummy;
	while(fptr.next!=null){
		sptr=sptr.next;
		fptr=fptr.next;
	}
	sptr.next = sptr.next.next;
	return dummy.next;
    }
}
