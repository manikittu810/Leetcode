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
        if(head == null){
            return null;
        }
        Node cur = head;
        Map<Node,Node> map = new HashMap<>();
        while(cur!=null){
            Node newNode = new Node(cur.val);
            map.put(cur,newNode);
            cur = cur.next;
            newNode = newNode.next;
        }
        cur = head;
        while(cur!=null){
            Node node = map.get(cur);
            node.next = map.get(cur.next);
            node.random = map.get(cur.random);
            node = node.next;
            cur = cur.next;
        }
        return map.get(head);
        
    }
}