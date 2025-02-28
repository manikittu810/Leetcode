class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
	ListNode dummy = new ListNode(-1);
	dummy.next = head;
	ListNode fptr = dummy;
	for(int i=0;i<n;i++){
		fptr = fptr.next; // reaches n steps ahead
	}        
	ListNode sptr = dummy;
	while(fptr.next!=null){
	fptr = fptr.next;
	sptr = sptr.next;//finds the node before the node to be removed
	}
	sptr.next = sptr.next.next;
	return dummy.next;
    }
}