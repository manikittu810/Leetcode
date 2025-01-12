/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode l1 = headA;
        ListNode l2 = headB;
        Set<ListNode> set = new HashSet<>();
if(l1==null || l2==null){
    return null;
}
        while(l1!=null){
            set.add(l1);
            l1 = l1.next;
        }
        while(l2!=null){
            if(!set.contains(l2)){
                set.add(l2);
            l2 = l2.next;
            }else{
                return l2;
            }
        }
return null;
    }
}