import java.util.Hashtable;
class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }
        
        // Step 1: Create a mapping from original nodes to their clones
        Hashtable<Node, Node> ht = new Hashtable<>();
        Node cur = head;

        // First pass: Create all nodes and store them in the hashtable
        while (cur != null) {
            ht.put(cur, new Node(cur.val));
            cur = cur.next;
        }

        // Step 2: Assign next and random pointers
        cur = head;

        while (cur != null) {
            Node duplicateNode = ht.get(cur);
            duplicateNode.next = (cur.next != null) ? ht.get(cur.next) : null;
            duplicateNode.random = (cur.random != null) ? ht.get(cur.random) : null;
            cur = cur.next;
        }

        // Return the head of the cloned list
        return ht.get(head);
    }
}
