/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node cur = head;

        HashMap<Node,Node> map = new HashMap<>();

        while(cur!=null){
            map.put(cur,new Node(cur.val));
            cur = cur.next;
        }

        cur = head;
        while(cur!=null){
            Node copyNode = map.get(cur);
            copyNode.next = map.get(cur.next);
            copyNode.random = map.get(cur.random);
            cur = cur.next;
        } 
        return map.get(head);
        
    }
}