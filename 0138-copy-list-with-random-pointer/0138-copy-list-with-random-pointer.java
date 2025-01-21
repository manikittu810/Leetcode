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

        Map<Node,Node> map = new HashMap<>();

        while(cur!=null){
            Node copyNode = new Node(cur.val);
            map.put(cur,copyNode);
            cur = cur.next;
        }

        cur = head;
        while(cur!= null){
            Node addNode = map.get(cur);
            addNode.next = map.get(cur.next);
            addNode.random = map.get(cur.random);
            cur = cur.next;
        }
return map.get(head);
    }
}