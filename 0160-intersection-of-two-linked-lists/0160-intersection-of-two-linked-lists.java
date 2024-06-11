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
        Set<ListNode> s = new HashSet<>();

        ListNode cur1 = headA;
        while(cur1!=null){
            s.add(cur1);
            cur1=cur1.next;
        }
        ListNode cur2 = headB;
         while(cur2!=null){
            if(!s.contains(cur2)){
            s.add(cur2);
            cur2=cur2.next;
            }
            else{
                return cur2;
            }
        }
        return null;
    }
}